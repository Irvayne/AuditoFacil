package br.ufpi.estagio.cge.teste.testeFuncional;

import java.sql.SQLException;
import java.util.ArrayList;

import br.ufpi.estagio.cge.extrator.AlgoritmoBusca;
import br.ufpi.estagio.cge.grafico.Dados;

public class TesteRefinarDadosDoBanco {

	public static void main(String[] args) throws SQLException {
		ArrayList<String> cargos = AlgoritmoBusca.listarCategorias();
		
		ArrayList<String> datas = new ArrayList();
		
		for(String cat: cargos){
			System.out.println(cat);
			Dados d = new Dados();
			d.setInput1(cat);
			d.setInput2("");
			d.setInput3("");
			d.setTipo("categoria");
			d.setReferencia("2014");
			AlgoritmoBusca.mediaSalarial(d);
			d.setReferencia("2015");
			AlgoritmoBusca.mediaSalarial(d);
			d.setReferencia("2016");
			AlgoritmoBusca.mediaSalarial(d);
		}
		
		
		
		
		
		

	}

}
