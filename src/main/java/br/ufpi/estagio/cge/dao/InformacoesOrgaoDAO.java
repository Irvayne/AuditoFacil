package br.ufpi.estagio.cge.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.ufpi.estagio.cge.dao.conexaoSGBD.Conexao;
/**
 * Metodo que realiza a manipulacao da tabela informacaoOrgao
 * @author Irvayne Matheus
 *
 */
public class InformacoesOrgaoDAO {
	/**
	 * Metodo que cria a tabela informacaoOrgao
	 * @throws SQLException
	 */
	private static void createTable() throws SQLException{
		String criarTabela = "CREATE TABLE IF NOT EXISTS informacoesOrgao ("
				+ "id INT(5) AUTO_INCREMENT PRIMARY KEY,"
				+ "orgao_descricao VARCHAR(50) NOT NULL,"
				+ "referencia VARCHAR(50) NOT NULL,"
				+ "soma_liquido DECIMAL(20),"
				+ "soma_bruto DECIMAL(20),"
				+ "qnt_servidores DECIMAL(20),"
				+ "categoria DECIMAL(20))"
				+ "ENGINE=MyISAM";
		PreparedStatement statement = Conexao.getConnection().prepareStatement(criarTabela);
		statement.execute();
		statement.close();
	}
	/**
	 * Metodo que insere um novo registro na tabela informacoesOrgao
	 * @param orgao - descricao do orgao
	 * @param data - referencia
	 * @param soma - soma 
	 * @param quantidade - quantidade
	 * @throws SQLException
	 */
	public static void inserir(String orgao, String data, double somaLiquido,double somaBruto, int quantidade, int Idcategoria) throws SQLException {

		String inserir = "insert into informacoesOrgao values (0, ?, ?, ?, ?,?,?)";

		PreparedStatement statement = Conexao.getConnection().prepareStatement(inserir);

		statement.setString(1, orgao);
		statement.setString(2, data);
		statement.setDouble(3, somaLiquido);
		statement.setDouble(4, somaBruto);
		statement.setInt(5, quantidade);
		statement.setInt(6, Idcategoria);

		statement.execute();
		statement.close();
	}
	/**
	 * Metodo que lista os orgaos de forma decrescente por meio da media salarial
	 * @param data - referencia a ser filtrada
	 * @return - lista com os orgaos
	 * @throws SQLException
	 */
	public static ArrayList<String> listarOrgaosDecrescente(String data) throws SQLException{

		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT orgao_descricao, soma_salarial/qnt_servidores as media "
				+ "FROM informacoesOrgao WHERE referencia like '"+data+"' order by media";

		ResultSet rs = st.executeQuery(cmd);

		ArrayList<String> aux = new ArrayList<>();
		while (rs.next()) {
			aux.add(rs.getString("orgao_descricao"));

		}
		return aux;

	}
	/**
	 * Metodo que informa a media salarial de uma determinado orgao
	 * @param orgao - orgao a ser pesquisado
	 * @param referencia - data a ser analisada
	 * @return - a media salarial
	 * @throws SQLException
	 */
	public static double buscarMedia(String orgao,String categoria, String referencia,String tipoSalario) throws SQLException{

		InformacoesOrgaoDAO.createTable();

		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT "+tipoSalario+",qnt_servidores FROM informacoesOrgao WHERE categoria="+CategoriaDAO.buscarId(categoria)+" and orgao_descricao like '"+orgao+"' and"
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
	 * Metodo que informa a qnt de servidores em um orgao
	 * @param orgao - orgao a ser pesquisado
	 * @param referencia - data a ser filtrada
	 * @return - a qnt de servidores
	 * @throws SQLException
	 */
	public static int buscarQuantidade(String orgao, String referencia) throws SQLException{

		InformacoesOrgaoDAO.createTable();

		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT qnt_servidores FROM informacoesOrgao WHERE orgao_descricao like '"+orgao+"' and"
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
	 * Metodo que exibe o gasto salarial de um orgao
	 * @param orgao - orgao a ser filtrado
	 * @param referencia - data especidficada
	 * @return - a media salarial
	 * @throws SQLException
	 */
	public static double gastoSalarial(String orgao, String referencia) throws SQLException{
		InformacoesOrgaoDAO.createTable();
		

		Statement st = Conexao.getConnection().createStatement();
		String cmd ="SELECT sum(v) as valor FROM"
				+ " (SELECT sum(m1.valor) as v FROM servidor s1"
				+ " inner join movimento m1 on s1.matricula = m1.matricula "
				+ " and s1.referencia = m1.referencia and s1.referencia like '"+referencia+"%'"
				+ " and m1.tipo like 'V' and s1.orgao_descricao =  '"+orgao+"'  group by s1.referencia order by s1.referencia)  as soma";
		ResultSet rs = st.executeQuery(cmd);

		while (rs.next()) {
			double valor = rs.getDouble("valor");
			st.close();
			return valor;
		}
		st.close();
		return 0;
		
	}
	



}
