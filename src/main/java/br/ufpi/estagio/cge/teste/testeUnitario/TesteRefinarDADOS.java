package br.ufpi.estagio.cge.teste.testeUnitario;

import java.sql.SQLException;
import java.util.ArrayList;

import br.ufpi.estagio.cge.extrator.AlgoritmoBusca;
import br.ufpi.estagio.cge.grafico.Dados;

public class TesteRefinarDADOS {

	public static void main(String[] args) {
		//----------------------------------------------------------
		
		ArrayList<String> orgao = new ArrayList<>();
		try {
			orgao = AlgoritmoBusca.listarOrgaos();
			System.out.println("Refinado dados dos Orgaos");
		} catch (SQLException e1) {
			
		}

		
		for (String aux : orgao) {
			System.out.println(" Analisando " + aux);
			Dados d = new Dados();
			d.setInput1(aux);
			d.setInput2("");
			d.setInput3("");
			d.setTipo("orgao");
			d.setReferencia("2014");
			try{
			AlgoritmoBusca.mediaSalarial(d);
			}catch(Exception e){
				
			}
			d.setReferencia("2015");
			try{
			AlgoritmoBusca.mediaSalarial(d);
			}catch(Exception e){
				
			}
			
			d.setReferencia("2016");
			try{
			AlgoritmoBusca.mediaSalarial(d);
			}catch(Exception e){
				
			}
		}
		
		//----------------------------------------------------------
		
				ArrayList<String> categoria = new ArrayList<>();
				try {
					categoria = AlgoritmoBusca.listarCategorias();
					System.out.println("Refinado dados das Categorias");
				} catch (SQLException e1) {
					
				}

				
				for (String aux : categoria) {
					System.out.println(" Analisando " + aux);
					Dados d = new Dados();
					d.setInput1(aux);
					d.setInput2("");
					d.setInput3("");
					d.setTipo("categoria");
					d.setReferencia("2014");
					try{
					AlgoritmoBusca.mediaSalarial(d);
					}catch(Exception e){
						
					}
					d.setReferencia("2015");
					try{
					AlgoritmoBusca.mediaSalarial(d);
					}catch(Exception e){
						
					}
					
					d.setReferencia("2016");
					try{
					AlgoritmoBusca.mediaSalarial(d);
					}catch(Exception e){
						
					}
				}

				//----------------------------------------------------------
				
				ArrayList<String> cargo = new ArrayList<>();
				try {
					cargo = AlgoritmoBusca.listarCargos();
					System.out.println("Refinado dados dos Cargos");
				} catch (SQLException e1) {
					
				}

				
				for (String aux : cargo) {
					System.out.println(" Analisando " + aux);
					Dados d = new Dados();
					d.setInput1(aux);
					d.setInput2("");
					d.setInput3("");
					d.setTipo("cargo");
					d.setReferencia("2014");
					try{
					AlgoritmoBusca.mediaSalarial(d);
					}catch(Exception e){
						
					}
					d.setReferencia("2015");
					try{
					AlgoritmoBusca.mediaSalarial(d);
					}catch(Exception e){
						
					}
					
					d.setReferencia("2016");
					try{
					AlgoritmoBusca.mediaSalarial(d);
					}catch(Exception e){
						
					}
				}

	}

}
