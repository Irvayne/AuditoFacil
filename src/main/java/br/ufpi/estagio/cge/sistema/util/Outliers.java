package br.ufpi.estagio.cge.sistema.util;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.estagio.cge.grafico.GraficoDispersao;
/**
 * Classe que implementa a algoritmo para encontrar os outliers
 * @author Irvayne Matheus
 *
 */
public class Outliers {

	/**
	 * Metodo que calcula os outliers a partir de um conjunto de servidores
	 * @param servidores - lista de todos os servidores
	 * @return - lista com os servidores fora do padrao
	 */
	public static ArrayList<GraficoDispersao> buscar(ArrayList<GraficoDispersao> servidores){
		//o calculo dos outliers so eh valido para listas com mais de 5 elementos
		if(servidores.size()>=5){
	
		QuickSort.sort(servidores);
		
		ArrayList<Double> salarios = new ArrayList<>();
		for(GraficoDispersao aux: servidores)
			salarios.add(aux.getData().get(0).get(1)); 
		
		@SuppressWarnings("unused")
		double menor = salarios.get(0);
		@SuppressWarnings("unused")
		double maior = salarios.get(salarios.size() - 1);
		@SuppressWarnings("unused")
		double mediana = mediana(salarios);
		
		double medianaInferior = mediana( salarios.subList(0, salarios.size()/2 - 1));
		double medianaSuperior = mediana( salarios.subList(salarios.size()/2, salarios.size()-1));
		
		double iqr = medianaSuperior - medianaInferior;
		double valOutlier = iqr * 1.5;
		
		ArrayList<GraficoDispersao> outliers = new ArrayList<>();
		
		for(GraficoDispersao aux : servidores){
			if(aux.getData().get(0).get(1) < medianaInferior - valOutlier || aux.getData().get(0).get(1) > medianaSuperior + valOutlier){
				outliers.add(aux);
			}
		}
		
		return outliers;
		
		
		}
		return servidores;
		
	}
	/**
	 * Metodo que realiza o calculo da mediana
	 * @param valores - lista com os elementos ordenados
	 * @return - valor da mediana
	 */
	private static double mediana(List<Double> valores){
		double mediana;
		if(valores.size()%2==0){
			mediana = (valores.get(valores.size()/2) + valores.get(valores.size()/2-1))/2;
		}else{
			mediana = valores.get(valores.size()/2);
		}
		return mediana;
	}
}
