package br.ufpi.estagio.cge.dao.conexaoSGBD;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Classe para realizar a conexao com o banco de dados
 * @author Irvayne Matheus
 *
 */
public class Conexao {

	static Connection conexao = null;
	
	/**
	 * Metodo que retorna uma instancia da conexao.
	 * @return - conexao ativa
	 */
	public static Connection getConnection(){
		if (conexao == null){
           new Conexao();			
		}
		return conexao;
	}
	
	/**
	 * Relaiza a conexao com o banco. Deve ser informado as configuracoes do banco nesse metodo
	 */
	private Conexao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/infofolha_cge",
					"root", "root");System.out.println("Conexao com o banco estabelecida com sucesso !");
	    } catch (Exception e){
	    	  System.out.println("Nao foi possivel conectar ao banco.");
	    	  System.out.println(e.getMessage());
	    }
	}
}
