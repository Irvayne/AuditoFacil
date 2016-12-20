package br.ufpi.estagio.cge.teste.testeFuncional;

import java.sql.SQLException;
import java.util.ArrayList;

import br.ufpi.estagio.cge.dao.CargoDAO;
import br.ufpi.estagio.cge.grafico.Dados;
import br.ufpi.estagio.cge.grafico.GraficoDispersao;
import br.ufpi.estagio.cge.sistema.util.QuickSort;

public class TesteAlgoritmoQuickSort {
	
	
	public static void main(String[] args) throws SQLException {
		Dados dados = new Dados();
		dados.setInput1("medico");
		dados.setInput2("efetivo");
		dados.setInput3("");
		dados.setReferencia("201604");
		dados.setTipoSalario("bruto");
		
		ArrayList<GraficoDispersao> disp = CargoDAO.graficoDispersaoSalarioPorTempo(dados);
		
		QuickSort.sort(disp);
		
		for(GraficoDispersao aux : disp){
			System.out.println(aux.getName() + " - "+aux.getData().get(0).get(1));
		}
		
		
	}

}
