package br.ufpi.estagio.cge.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.ufpi.estagio.cge.dao.conexaoSGBD.Conexao;
/**
 * Classe que realiza a manipulacao da tabela InformacoesCategoria
 * @author Irvayne Matheus
 *
 */
public class InformacoesCategoriaDAO {
	/**
	 * Metodo que criar a tabela informacoesCategoria
	 * @throws SQLException
	 */
	private static void createTable() throws SQLException{
		String criarTabela = "CREATE TABLE IF NOT EXISTS informacoesCategoria ("
				+ "id INT(5) AUTO_INCREMENT PRIMARY KEY,"
				+ "categoria_descricao VARCHAR(50) NOT NULL,"
				+ "referencia VARCHAR(50) NOT NULL,"
				+ "soma_liquido DECIMAL(20),"
				+ "soma_bruto DECIMAL(20),"
				+ "qnt_servidores DECIMAL(20))"
				+ "ENGINE=MyISAM";
		PreparedStatement statement = Conexao.getConnection().prepareStatement(criarTabela);
		statement.execute();
		statement.close();
	}
	/**
	 * Metodo para inserir um novo registro na tabela informacoes categoria
	 * @param cat - descricao da categoria
	 * @param data - referencia
	 * @param soma_liquida - soma liquida
	 * @param soma_bruto - soma bruta
	 * @param quantidade - qnt de servidores
	 * @throws SQLException
	 */
	public static void inserir(String cat, String data, double soma_liquida, double soma_bruto, int quantidade) throws SQLException {
		
		String inserir = "insert into informacoesCategoria values (0, ?, ?, ?, ?, ?)";

		PreparedStatement statement = Conexao.getConnection().prepareStatement(inserir);

		statement.setString(1, cat);
		statement.setString(2, data);
		statement.setDouble(3, soma_liquida);
		statement.setDouble(4, soma_bruto);
		statement.setInt(5, quantidade);
		
		
		statement.execute();
		statement.close();
	}
	/**
	 * Metodo que informa a media de uma categoria em uma referencia especifica
	 * @param cat - categoria a ser filtrada
	 * @param referencia - data a ser filtrada
	 * @return - a media salarial
	 * @throws SQLException
	 */
	public static double buscarMedia(String cat, String referencia, String tipoSalario) throws SQLException{
		
		InformacoesCategoriaDAO.createTable();
		
		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT "+tipoSalario+",qnt_servidores FROM informacoesCategoria WHERE categoria_descricao like '"+cat+"' and"
				+ " referencia like '"+referencia+"'";
		
		
		ResultSet rs = st.executeQuery(cmd);

		
		while (rs.next()) {
			 double media =  rs.getDouble(tipoSalario)/rs.getInt("qnt_servidores");
			 st.close();
			 return media;
		}
		
		st.close();
		return -1;
	}
	/**
	 * Metodo que informa a qnt de servidores de uma determinada categoria em uma determinada referencia
	 * @param cat - categoria a ser filtrada
	 * @param referencia - referencia a ser filtrada
	 * @return - a qnt de servidores
	 * @throws SQLException
	 */
	public static int buscarQuantidade(String cat, String referencia) throws SQLException{
		
		InformacoesCategoriaDAO.createTable();
		
		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT qnt_servidores FROM informacoesCategoria WHERE categoria_descricao like '"+cat+"' and"
				+ " referencia like '"+referencia+"'";
		
		
		ResultSet rs = st.executeQuery(cmd);

		
		while (rs.next()) {
			 int qnt =  rs.getInt("qnt_servidores");
			 st.close();
			 return qnt;
		}
		st.close();
		return -1;
	}
	/**
	 * Metodo que exibe o gasto salarial de uma categoria
	 * @param categoria - categoria a ser pesquisada
	 * @param referencia - data especifica a ser filtrada
	 * @return - o gasto salarial bruto
	 * @throws SQLException
	 */
	public static double gastoSalarial(String categoria, String referencia) throws SQLException{
		InformacoesCategoriaDAO.createTable();
		

		Statement st = Conexao.getConnection().createStatement();
		String cmd ="SELECT sum(v) as valor FROM"
				+ "(SELECT sum(m1.valor) as v FROM servidor s1"
				+ "inner join movimento m1 on s1.matricula = m1.matricula "
				+ "and s1.referencia = m1.referencia and s1.referencia like '"+referencia+"%'"
				+ "and m1.tipo like 'V' and s1.categoria =  "+CategoriaDAO.buscarDescricao(categoria)+"  group by s1.referencia order by s1.referencia)  as soma";

		ResultSet rs = st.executeQuery(cmd);

		while (rs.next()) {
			double valor = rs.getDouble("valor");
			st.close();
			return valor;
		}
		st.close();
		return 0;
		
	}
	
	/**
	 * Metodo que lista as categorias de forma decrescento por meio da media salarial
	 * @param data - data a ser pesquisada
	 * @return - lista com as categorias
	 * @throws SQLException
	 */
	public static ArrayList<String> listarCategoriasDecrescente(String data) throws SQLException{

		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT categoria_descricao, soma_bruto/qnt_servidores as media "
				+ "FROM informacoesCategoria WHERE referencia like '"+data+"' order by media";

		ResultSet rs = st.executeQuery(cmd);

		ArrayList<String> aux = new ArrayList<>();
		while (rs.next()) {
			aux.add(rs.getString("categoria_descricao"));

		}
		return aux;

	}

}
