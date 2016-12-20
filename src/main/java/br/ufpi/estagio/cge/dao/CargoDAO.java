package br.ufpi.estagio.cge.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction.SUM;

import com.google.gson.Gson;

import br.ufpi.estagio.cge.dao.conexaoSGBD.Conexao;
import br.ufpi.estagio.cge.grafico.Dados;
import br.ufpi.estagio.cge.grafico.GraficoDispersao;
import br.ufpi.estagio.cge.grafico.GraficoLinha;
import br.ufpi.estagio.cge.grafico.GraficoPizza;
import br.ufpi.estagio.cge.sistema.util.Outliers;
/**
 * Classe que realiza as manipulacoes da tabela cargo
 * @author Irvayne Matheus
 *
 */
public class CargoDAO {

	/**
	 * Metodo para criar a tabela
	 * @throws SQLException
	 */
	private static void createTable() throws SQLException {
		String criarTabela = "CREATE TABLE IF NOT EXISTS cargo (" + "id INT(5) AUTO_INCREMENT PRIMARY KEY,"
				+ "cargo_descricao VARCHAR(100) NOT NULL)" + "ENGINE=MyISAM";
		PreparedStatement statement = Conexao.getConnection().prepareStatement(criarTabela);
		statement.execute();
		statement.close();
	}
	/**
	 * Metodo para inserir um novo cargo
	 * @param cargo - cargo a ser inserido
	 * @throws SQLException
	 */
	public static void inserir(String cargo) throws SQLException {

		String inserir = "insert into cargo values (0, ?)";

		PreparedStatement statement = Conexao.getConnection().prepareStatement(inserir);

		statement.setString(1, cargo);

		statement.execute();
		statement.close();
	}
	
	/**
	 * Metodo para listar todos os cargos
	 * @return - lista com todos os cargos
	 * @throws SQLException
	 */
	public static ArrayList<String> listar() throws SQLException {

		CargoDAO.createTable();

		ArrayList<String> cargos = new ArrayList<String>();

		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT cargo_descricao FROM cargo order by cargo_descricao";

		ResultSet rs = st.executeQuery(cmd);

		while (rs.next()) {
			if (!rs.getString("cargo_descricao").contains("'"))
				cargos.add(rs.getString("cargo_descricao"));
		}

		// caso na primeira tentativa a tabela esteja vazia, entao e realizado
		// uma busca no servidor e preenchido a tabela cargo
		if (cargos.size() == 0) {
			String cmd2 = "SELECT distinct(cargo_descricao) as cargo FROM servidor order by cargo_descricao";

			rs = st.executeQuery(cmd2);

			while (rs.next()) {
				String cargo = rs.getString("cargo");
				if (!cargo.contains("'")) {
					cargos.add(cargo);
					CargoDAO.inserir(cargo);
				}
			}
		}

		st.close();

		return cargos;
	}

	/**
	 * Metodo para realizar a busca das informacoes para a funcionalidade de dispersao
	 * @param dados - dados a serem buscados
	 * @return - lista com os objetos a serem exibidos na view
	 * @throws SQLException
	 */
	public static ArrayList<GraficoDispersao> graficoDispersaoSalarioPorTempo(Dados dados) throws SQLException {
		ArrayList<GraficoDispersao> listaDados = new ArrayList<>();
		String codigoCategoria = "";
		if (!dados.getInput2().equals(""))
			codigoCategoria = CategoriaDAO.buscarId(dados.getInput2());

		Statement st = Conexao.getConnection().createStatement();
		String aux = null;
		if (dados.getTipoSalario().equals("liquido")) {
			aux = "( SELECT pesq1.matricula,pesq1.nome, (v-d) as salario, pesq1.data_admissao from "
					+ " (SELECT s1.data_admissao,s1.nome,m1.matricula,m1.referencia,sum(valor) as v "
					+ " FROM infofolha_cge.servidor s1 inner join infofolha_cge.movimento m1"
					+ " on s1.matricula = m1.matricula and s1.referencia = m1.referencia and s1.referencia" + " like '"
					+ dados.getReferencia() + "' and m1.tipo like 'V' and s1.cargo_descricao like '" + dados.getInput1()
					+ "' and categoria like '%" + codigoCategoria + "%' and orgao_descricao like '%" + dados.getInput3()
					+ "%'" + "group by m1.matricula,m1.tipo" + " ) pesq1" + " inner join"
					+ " (SELECT m1.matricula,m1.referencia,sum(valor) as d"
					+ " FROM infofolha_cge.servidor s1 inner join infofolha_cge.movimento m1"
					+ " on s1.matricula = m1.matricula and s1.referencia = m1.referencia and s1.referencia" + " like '"
					+ dados.getReferencia() + "' and m1.tipo like 'D' and s1.cargo_descricao like '" + dados.getInput1()
					+ "' and categoria like '%" + codigoCategoria + "%' and orgao_descricao like '%" + dados.getInput3()
					+ "%'" + "group by m1.matricula,m1.tipo" + " ) pesq2 on pesq1.matricula=pesq2.matricula)";
		} else {
			aux = "( SELECT pesq1.matricula,pesq1.nome, (v) as salario, pesq1.data_admissao from "
					+ " (SELECT s1.data_admissao,s1.nome,m1.matricula,m1.referencia,sum(valor) as v "
					+ " FROM infofolha_cge.servidor s1 inner join infofolha_cge.movimento m1"
					+ " on s1.matricula = m1.matricula and s1.referencia = m1.referencia and s1.referencia" + " like '"
					+ dados.getReferencia() + "' and m1.tipo like 'V' and s1.cargo_descricao like '" + dados.getInput1()
					+ "' and categoria like '%" + codigoCategoria + "%' and orgao_descricao like '%" + dados.getInput3()
					+ "%'" + "group by m1.matricula,m1.tipo" + " ) pesq1" + " inner join"
					+ " (SELECT m1.matricula,m1.referencia,sum(valor) as d"
					+ " FROM infofolha_cge.servidor s1 inner join infofolha_cge.movimento m1"
					+ " on s1.matricula = m1.matricula and s1.referencia = m1.referencia and s1.referencia" + " like '"
					+ dados.getReferencia() + "' and m1.tipo like 'D' and s1.cargo_descricao like '" + dados.getInput1()
					+ "' and categoria like '%" + codigoCategoria + "%' and orgao_descricao like '%" + dados.getInput3()
					+ "%'" + "group by m1.matricula,m1.tipo" + " ) pesq2 on pesq1.matricula=pesq2.matricula)";

		}
		ResultSet rs = st.executeQuery(aux);

		while (rs.next()) {
			String codigo = rs.getString("matricula");
			double salario = rs.getDouble("salario");
			String dataAdmissao = rs.getString("data_admissao");
			String nome = rs.getString("nome");

			String mesAdmissao = dataAdmissao.substring(5, 6);
			String anoAdmissao = dataAdmissao.substring(0, 4);

			String anoReferencia = dados.getReferencia().substring(0, 4);
			String mesReferencia = dados.getReferencia().substring(5);

			double qtdMes = (Integer.parseInt(anoReferencia) - Integer.parseInt(anoAdmissao)) * 12;
			qtdMes += (Integer.parseInt(mesReferencia) - Integer.parseInt(mesAdmissao));
			ArrayList<Double> dispersao = new ArrayList<>();
			dispersao.add(qtdMes);
			dispersao.add(salario);

			ArrayList<ArrayList<Double>> lista = new ArrayList<>();
			lista.add(dispersao);

			GraficoDispersao obj = new GraficoDispersao();
			obj.setType("scatter");
			obj.setName("Matrícula: " + codigo + " Nome: " + nome);
			obj.setData(lista);

			listaDados.add(obj);

		}
		//trecho de codigo que realiza o calculo dos outliers 
		//TODO necessario otimizacao
		ArrayList<GraficoDispersao> listaAux = new ArrayList<>();
		for(GraficoDispersao aux1 : listaDados){
			GraficoDispersao var = new GraficoDispersao();
			var.setData(aux1.getData());
			var.setName(aux1.getName());
			var.setType(aux1.getType());
			listaAux.add(var);
		}
		
		
		listaAux = Outliers.buscar(listaAux);
		
		for(GraficoDispersao g : listaDados){
			for(GraficoDispersao g1 : listaAux){
				if(g.getName().equals(g1.getName()))
					g.setColor("rgba(255, 000, 000, .5)");
			}
		}
		
		return listaDados;

	}

	/**
	 * Metodo para buscar as informacoes a serem exibidas na funcionalidade faixa etaria
	 * @param ano - ano para ser realizado a busca
	 * @param cargo - o cargo a ser encontrado
	 * @return - lista com os objetos a serem exibidos na view
	 * @throws SQLException
	 */
	public static String faixaEtaria(String ano, String cargo) throws SQLException {
		int quantidadeDeServidores=0;
		int[] contadores = new int[20];
		Statement st = Conexao.getConnection().createStatement();
		String aux = "SELECT distinct (cpf), data_nascimento FROM infofolha_cge.servidor where referencia like '" + ano
				+ "%' and cargo_descricao like '" + cargo + "'";
		ResultSet rs = st.executeQuery(aux);
		while (rs.next()) {
			quantidadeDeServidores++;
			String dataNasc = rs.getString("data_nascimento");
			Calendar calendario = Calendar.getInstance();
			int anoAtual = calendario.get(Calendar.YEAR);
			int mesAtual = calendario.get(Calendar.MONTH);
			if (dataNasc.length() >= 8) {
				String mesnasc = dataNasc.substring(5, 6);
				String anoNasc = dataNasc.substring(0, 4);

				int idade = anoAtual - Integer.parseInt(anoNasc);
				int mes = mesAtual - Integer.parseInt(mesnasc);
				if (mes == 0) {
					idade += 1;
				}
				if (idade >= 0 && idade <= 5) {
					contadores[0]++;
				} else if (idade >= 6 && idade <= 10) {
					contadores[1]++;
				} else if (idade >= 11 && idade <= 15) {
					contadores[2]++;
				} else if (idade >= 16 && idade <= 20) {
					contadores[3]++;
				} else if (idade >= 21 && idade <= 25) {
					contadores[4]++;
				} else if (idade >= 26 && idade <= 30) {
					contadores[5]++;
				} else if (idade >= 31 && idade <= 35) {
					contadores[6]++;
				} else if (idade >= 36 && idade <= 40) {
					contadores[7]++;
				} else if (idade >= 41 && idade <= 45) {
					contadores[8]++;
				} else if (idade >= 46 && idade <= 50) {
					contadores[9]++;
				} else if (idade >= 51 && idade <= 55) {
					contadores[10]++;
				} else if (idade >= 56 && idade <= 60) {
					contadores[11]++;
				} else if (idade >= 61 && idade <= 65) {
					contadores[12]++;
				} else if (idade >= 66 && idade <= 70) {
					contadores[13]++;
				} else if (idade >= 71 && idade <= 75) {
					contadores[14]++;
				} else if (idade >= 76 && idade <= 80) {
					contadores[15]++;
				} else if (idade >= 81 && idade <= 85) {
					contadores[16]++;
				} else if (idade >= 86 && idade <= 90) {
					contadores[17]++;
				} else if (idade >= 91 && idade <= 95) {
					contadores[18]++;
				} else if (idade >= 96 && idade <= 100) {
					contadores[19]++;
				}
			}
		}

		Gson json = new Gson();
		json.toJson(contadores);
		return "[{" + json.toJson("name") + ": " + json.toJson(cargo +" / quantidade = "+quantidadeDeServidores) + "," + json.toJson("data") + ": "
				+ json.toJson(contadores) + "}]";

	}

	/**
	 * Metodo que calcula a media salarial do cargo indicado nas datas
	 * selecionadas
	 * 
	 * @param cargo
	 *            - o cargo que deseja calcular a media salarial
	 * @param datas
	 *            - as datas que deseja encontrar a media salarial
	 * @return - retorna um objeto grafico linha informando qual cargo e uma
	 *         lista de medias
	 * @throws SQLException
	 */
	public static GraficoLinha listarMediaSalarial(String cargo, ArrayList<String> datas, String tipoSalario,
			String categoria, String orgao) throws SQLException {

		GraficoLinha grafico = new GraficoLinha();
		grafico.setName(cargo + "--" + categoria + "--" + orgao);
		grafico.setData(new ArrayList<Double>());

		Statement st = Conexao.getConnection().createStatement();

		for (String data : datas) {
			
			 double media = InformacoesCargoDAO.buscarMedia(cargo, data,
			 tipoSalario, categoria, orgao);
			if (media == -1) {

				/*
				 * No primeiro select, ele soma o salario de todos os
				 * funcionario do mes e do cargo especificado que sejam do tipo
				 * V, ou seja, o salario eh um vencimento. No segundo select,
				 * ele soma para o tipo de salario D. Depois ele subtrai esses
				 * dois resultados. Logo apos isso, ele calcula a quantidade de
				 * funcinarios e divide o resultado da subtracao do primeiro
				 * select com o segundo select por essa qunatidade e entao e
				 * encontrado a media.
				 */
				String cmd = null;
				// if (!categoria.equals("")) {
				if ((!categoria.equals("")) && (!orgao.equals(""))) {
					cmd = "SELECT (v-d) as soma,v as bruto, qnt as quantidade, categoria from "
							+ " ((SELECT sum(m1.valor) as v, s1.categoria as categoria FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "'"
							+ " and m1.tipo like 'V' and s1.cargo_descricao like '"+cargo+"' and s1.categoria = "
							+ CategoriaDAO.buscarId(categoria) + " and s1.orgao_descricao = '" + orgao + "'"
							+ " group by s1.referencia order by s1.referencia)" + " pesq1,"
							+ " (SELECT sum(m1.valor) as d FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "' "
							+ " and m1.tipo like 'D' and s1.cargo_descricao like '"+cargo+"' and  s1.categoria = "
							+ CategoriaDAO.buscarId(categoria) + " and s1.orgao_descricao = '" + orgao + "'"
							+ " group by s1.referencia order by s1.referencia)  " + "	pesq2,"
							+ "	(SELECT count(*) as qnt FROM servidor where referencia like '" + data + "'"
							+ " and cargo_descricao like '"+cargo+"' and categoria = " + CategoriaDAO.buscarId(categoria)
							+ " and orgao_descricao = '" + orgao + "'" + "	)  pesq3 )";
				} else if ((!categoria.equals("")) && orgao.equals("")) {
					cmd = "SELECT (v-d) as soma,v as bruto, qnt as quantidade, categoria from "
							+ " ((SELECT sum(m1.valor) as v, s1.categoria as categoria FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "'"
							+ " and m1.tipo like 'V' and s1.cargo_descricao like '"+cargo+"' and s1.categoria = "
							+ CategoriaDAO.buscarId(categoria) + " " + " group by s1.referencia order by s1.referencia)"
							+ " pesq1," + " (SELECT sum(m1.valor) as d FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "' "
							+ " and m1.tipo like 'D' and s1.cargo_descricao like '"+cargo+"' and  s1.categoria = "
							+ CategoriaDAO.buscarId(categoria) + " "
							+ " group by s1.referencia order by s1.referencia)  " + "	pesq2,"
							+ "	(SELECT count(*) as qnt FROM servidor where referencia like '" + data + "'"
							+ " and cargo_descricao like '"+cargo+"' and categoria = " + CategoriaDAO.buscarId(categoria)
							+ " " + "	)  pesq3 )";
				} else if (categoria.equals("") && (!orgao.equals(""))) {
					cmd = "SELECT (v-d) as soma,v as bruto, qnt as quantidade, categoria from "
							+ " ((SELECT sum(m1.valor) as v, s1.categoria as categoria FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "'"
							+ " and m1.tipo like 'V' and s1.cargo_descricao like '"+cargo+"'  and s1.orgao_descricao = '"
							+ orgao + "'" + " group by s1.referencia order by s1.referencia)" + " pesq1,"
							+ " (SELECT sum(m1.valor) as d FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "' "
							+ " and m1.tipo like 'D' and s1.cargo_descricao like '"+cargo+"' and s1.orgao_descricao = '"
							+ orgao + "'" + " group by s1.referencia order by s1.referencia)  " + "	pesq2,"
							+ "	(SELECT count(*) as qnt FROM servidor where referencia like '" + data + "'"
							+ " and cargo_descricao like '"+cargo+"'   and orgao_descricao = '" + orgao + "'"
							+ "	)  pesq3 )";
				} else if (categoria.equals("") && orgao.equals("")) {
					cmd = "SELECT (v-d) as soma,v as bruto, qnt as quantidade, categoria from "
							+ " ((SELECT sum(m1.valor) as v, s1.categoria as categoria FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "'"
							+ " and m1.tipo like 'V' and s1.cargo_descricao like '"+cargo+"'"
							+ " group by s1.referencia order by s1.referencia)" + " pesq1,"
							+ " (SELECT sum(m1.valor) as d FROM servidor s1"
							+ " inner join movimento m1 on s1.matricula = m1.matricula "
							+ " and s1.referencia = m1.referencia and s1.referencia like '" + data + "' "
							+ " and m1.tipo like 'D' and s1.cargo_descricao like '"+cargo+"' "
							+ " group by s1.referencia order by s1.referencia)  " + "	pesq2,"
							+ "	(SELECT count(*) as qnt FROM servidor where referencia like '" + data + "'"
							+ " and cargo_descricao like '"+cargo+"' " + "	)  pesq3 )";
				}
				ResultSet rs = st.executeQuery(cmd);

				if (rs.next()) {

					double somaLiquido = rs.getDouble("soma");
					int quantidade = rs.getInt("quantidade");

					double somaBruto = rs.getDouble("bruto");
					if (tipoSalario.equals("liquido")) {
						media = somaLiquido / quantidade;
					} else {
						media = somaBruto / quantidade;

					}

					grafico.getData().add(media);

					InformacoesCargoDAO.inserir(cargo, data, somaLiquido, somaBruto, quantidade,
							Integer.parseInt(CategoriaDAO.buscarId(categoria)), OrgaoDAO.buscarId(orgao));
				}

			} else {
				grafico.getData().add(media);
			}

		}
		st.close();

		return grafico;
	}
	/**
	 * Metodo para encontrar a porcentagem de gasto de cada cargo
	 * @param referencia - mes a ser pesquisado
	 * @return - grafico a ser exibido na view
	 * @throws SQLException
	 */
	public static ArrayList<GraficoPizza> porcentagemGasto(String referencia) throws SQLException {
		
		ArrayList<GraficoPizza> grafico = new ArrayList<>();
		Statement st = Conexao.getConnection().createStatement();
		String cmd = "SELECT "
				+ "serv.cargo_descricao as name, SUM(mov.valor) as y "
				+ "FROM"
				+ " servidor AS serv"
				+ " INNER JOIN"
				+ " movimento AS mov ON serv.referencia LIKE '"+referencia+"'"
				+ " AND mov.referencia LIKE '"+referencia+"'"
				+ " AND mov.tipo LIKE 'V'"
				+ " AND serv.matricula = mov.matricula"
				+ " AND serv.referencia = mov.referencia"
				+ " GROUP BY serv.cargo_descricao";

		ResultSet rs = st.executeQuery(cmd);

		while (rs.next()) {
				GraficoPizza pizza = new GraficoPizza();
				pizza.setName(rs.getString("name"));
				pizza.setY(rs.getDouble("y"));
				grafico.add(pizza);
		}
		
		return grafico;
		
	}

}
