package br.ufpi.estagio.cge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ufpi.estagio.cge.dao.conexaoSGBD.Conexao;
import br.ufpi.estagio.cge.modelo.Movimento;

/**
 * Classe que manipula a tabela movimento
 * 
 * @author Irvayne Matheus
 *
 */
public class MovimentoDAO {
	/**
	 * Metodo que lista todos os movimentos de um servidor
	 * 
	 * @param matricula
	 *            - matricula do servidor
	 * @return - lista com os movimentos
	 * @throws SQLException
	 */
	public static List<Movimento> listarMovimento(String matricula) throws SQLException {

		List<Movimento> movimentos = new ArrayList<>();

		Statement st = Conexao.getConnection().createStatement();
		String cmd;
		cmd = "SELECT referencia, valor, tipo  FROM movimento where matricula like '" + matricula
				+ "' order by referencia";
		ResultSet rs = st.executeQuery(cmd);
		while (rs.next()) {
			Movimento movimento = new Movimento();
			movimento.setReferencia(rs.getString("referencia"));
			movimento.setValor(rs.getDouble("valor"));
			movimento.setTipo(rs.getString("tipo"));

			movimentos.add(movimento);

		}
		st.close();
		return movimentos;
	}

	/**
	 * Metodo que lista os movimentos de um servidor em uma data especifica
	 * 
	 * @param matricula
	 *            - matricula do servidor
	 * @param referencia
	 *            - data a ser pesquisada
	 * @return - lista com os movimentos
	 * @throws SQLException
	 */
	public static List<Movimento> listarMovimento(String matricula, String referencia) throws SQLException {

		List<Movimento> movimentos = new ArrayList<>();

		Statement st = Conexao.getConnection().createStatement();
		String cmd;
		cmd = "SELECT referencia, valor, tipo, financeiro_descricao  FROM movimento where matricula like '"
				+ matricula + "' " + "and referencia like '" + referencia + "'";
		ResultSet rs = st.executeQuery(cmd);
		while (rs.next()) {
			Movimento movimento = new Movimento();
			movimento.setReferencia(rs.getString("referencia"));
			movimento.setValor(rs.getDouble("valor"));
			movimento.setTipo(rs.getString("tipo"));
			movimento.setFinanceiro_descricao(rs.getString("financeiro_descricao"));

			movimentos.add(movimento);

		}
		st.close();
		return movimentos;
	}

	/**
	 * Metodo que lista os movimentos de um cargo/categoria/orgao
	 * 
	 * @param string
	 *            - lista contendo o cargo/categoria/orgao
	 * @param referencia
	 *            - data a ser pesquisada
	 * @return - lista com os movimentos
	 * @throws SQLException
	 */
	public static List<Movimento> listarMovimentoPorDescricao(String tipo, String string[], String referencia)
			throws SQLException {
		String cmd = "";
		if (tipo.equals("cargo")) {
			if (string.length == 1) {
				cmd = "SELECT " + "mov.financeiro_descricao," + " SUM(mov.valor) AS soma," + " mov.tipo,"
						+ " COUNT(*) AS qnt" + " FROM" + " infofolha_cge.servidor AS serv" + " INNER JOIN"
						+ " infofolha_cge.movimento AS mov ON serv.matricula = mov.matricula"
						+ " AND serv.referencia = mov.referencia" + " WHERE" + " serv.cargo_descricao LIKE '"
						+ string[0] + "'" + " AND serv.referencia LIKE '" + referencia + "'"
						+ " GROUP BY mov.financeiro_descricao"
						+ " ORDER BY mov.financeiro_descricao,mov.tipo DESC, soma DESC";
			} else if (string.length == 2) {
				cmd = "SELECT " + "mov.financeiro_descricao," + " SUM(mov.valor) AS soma," + " mov.tipo,"
						+ " COUNT(*) AS qnt" + " FROM" + " infofolha_cge.servidor AS serv" + " INNER JOIN"
						+ " infofolha_cge.movimento AS mov ON serv.matricula = mov.matricula"
						+ " AND serv.referencia = mov.referencia" + " WHERE" + " serv.cargo_descricao LIKE '"
						+ string[0] + "'" + " AND serv.categoria = " + CategoriaDAO.buscarId(string[1]) + ""
						+ " AND serv.referencia LIKE '" + referencia + "'" + " GROUP BY mov.financeiro_descricao"
						+ " ORDER BY mov.financeiro_descricao,mov.tipo DESC, soma DESC";
			} else if (string.length == 3) {
				cmd = "SELECT " + "mov.financeiro_descricao," + " SUM(mov.valor) AS soma," + " mov.tipo,"
						+ " COUNT(*) AS qnt" + " FROM" + " infofolha_cge.servidor AS serv" + " INNER JOIN"
						+ " infofolha_cge.movimento AS mov ON serv.matricula = mov.matricula"
						+ " AND serv.referencia = mov.referencia" + " WHERE" + " serv.cargo_descricao LIKE '"
						+ string[0] + "'" + " AND serv.categoria = " + CategoriaDAO.buscarId(string[1]) + ""
						+ " AND serv.orgao_descricao like '" + string[2] + "'" + " AND serv.referencia LIKE '"
						+ referencia + "'" + " GROUP BY mov.financeiro_descricao"
						+ " ORDER BY mov.financeiro_descricao,mov.tipo DESC, soma DESC";
			}
		} else if (tipo.equals("categoria")) {
			cmd = "SELECT "
					+ " mov.financeiro_descricao,"
					+ " SUM(mov.valor) AS soma,"
					+ " mov.tipo,"
					+ " COUNT(*) AS qnt"
					+ " FROM"
					+ " infofolha_cge.servidor AS serv"
					+ " INNER JOIN"
					+ " infofolha_cge.movimento AS mov ON serv.matricula = mov.matricula"
					+ " AND serv.referencia = mov.referencia"
					+ " WHERE"
					+ " serv.categoria = "+CategoriaDAO.buscarId(string[0])+""
					+ " AND serv.referencia LIKE '"+referencia+"'"
					+ " GROUP BY mov.financeiro_descricao"
					+ " ORDER BY mov.financeiro_descricao , mov.tipo DESC , soma DESC";

		}
		else{
			if (string.length == 1) {
				cmd = "SELECT " + "mov.financeiro_descricao," + " SUM(mov.valor) AS soma," + " mov.tipo,"
						+ " COUNT(*) AS qnt" + " FROM" + " infofolha_cge.servidor AS serv" + " INNER JOIN"
						+ " infofolha_cge.movimento AS mov ON serv.matricula = mov.matricula"
						+ " AND serv.referencia = mov.referencia" + " WHERE" + " serv.orgao_descricao LIKE '"
						+ string[0] + "'" + " AND serv.referencia LIKE '" + referencia + "'"
						+ " GROUP BY mov.financeiro_descricao"
						+ " ORDER BY mov.financeiro_descricao,mov.tipo DESC, soma DESC";
			}
			 else if (string.length == 2) {
					cmd = "SELECT " + "mov.financeiro_descricao," + " SUM(mov.valor) AS soma," + " mov.tipo,"
							+ " COUNT(*) AS qnt" + " FROM" + " infofolha_cge.servidor AS serv" + " INNER JOIN"
							+ " infofolha_cge.movimento AS mov ON serv.matricula = mov.matricula"
							+ " AND serv.referencia = mov.referencia" + " WHERE" + " serv.orgao_descricao LIKE '"
							+ string[0] + "'" + " AND serv.categoria = " + CategoriaDAO.buscarId(string[1]) + ""
							+ " AND serv.referencia LIKE '" + referencia + "'" + " GROUP BY mov.financeiro_descricao"
							+ " ORDER BY mov.financeiro_descricao,mov.tipo DESC, soma DESC";
				}
			
		}

		List<Movimento> movimentos = new ArrayList<>();

		Statement st = Conexao.getConnection().createStatement();
		ResultSet rs = st.executeQuery(cmd);
		while (rs.next()) {
			Movimento movimento = new Movimento();
			movimento.setQuantidade(rs.getDouble("qnt"));
			movimento.setValor(rs.getDouble("soma"));
			movimento.setTipo(rs.getString("tipo"));
			movimento.setFinanceiro_descricao(rs.getString("financeiro_descricao"));

			movimentos.add(movimento);

		}
		st.close();
		return movimentos;
	}
}
