package br.ufpi.estagio.cge.teste.testeFuncional;

import java.sql.SQLException;

import br.ufpi.estagio.cge.extrator.AlgoritmoBusca;
import br.ufpi.estagio.cge.grafico.Dados;

public class TesteFuncionalidadePiramide {

	public static void main(String[] args) throws SQLException {
		Dados dados = new Dados();
		dados.setInput1("MEDICO");
		dados.setInput2("VIGIA");
		dados.setInput3("GOVERNADOR DO ESTADO");
		
		dados.setReferencia("2014");
		dados.setTipo("categorias");
		String val = AlgoritmoBusca.piramideHierarquica(dados);
		System.out.print(val);
		
	}

}
