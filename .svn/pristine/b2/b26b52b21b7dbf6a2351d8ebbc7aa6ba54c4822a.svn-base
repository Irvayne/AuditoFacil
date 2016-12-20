package br.ufpi.estagio.cge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.ufpi.estagio.cge.dao.conexaoSGBD.Conexao;
import br.ufpi.estagio.cge.modelo.Servidor;

/**
 * Classe que manipula a tabela servidor
 * 
 * @author irvaynematheus
 *
 */
public class ServidorDAO {
	/**
	 * Metodo que busca um servidor de uma determinada matricula
	 * @param matricula - matricula do servidor
	 * @return - o objeto servidor
	 * @throws SQLException
	 */
	public static Servidor buscar(String matricula) throws SQLException {
		Statement st = Conexao.getConnection().createStatement();

		String aux = "SELECT distinct(cpf) as cpf, nome, matricula, cargo_descricao, "
				+ "orgao_descricao, categoria, data_nascimento, data_admissao, cidade_descricao "
				+ "FROM servidor where matricula like '" + matricula + "'";

		ResultSet rs = st.executeQuery(aux);

		Servidor servidor = new Servidor();
		if (rs.next()) {
			servidor.setNome(rs.getString("nome"));
			servidor.setCpf(rs.getString("cpf"));
			servidor.setMatricula(rs.getString("matricula"));
			servidor.setCargo_descricao(rs.getString("cargo_descricao"));
			servidor.setOrgao_descricao(rs.getString("orgao_descricao"));
			servidor.setData_nascimento(rs.getString("data_nascimento"));
			servidor.setData_admissao(rs.getString("data_admissao"));
			servidor.setCidade_descicao(rs.getString("cidade_descricao"));
			servidor.setCategoria(rs.getString("categoria"));
		}
		return servidor;
	}
	
}
