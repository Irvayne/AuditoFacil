package br.ufpi.estagio.cge.sistema.util;

import java.util.ArrayList;

import br.ufpi.estagio.cge.grafico.GraficoDispersao;
/**
 * Classe que implementa o algoritmo de ordenacao quick sort
 * @author Irvayne Matheus
 *
 */
public class QuickSort {
	
	/**
	 * Metodo que inicia o processo de ordenacao
	 * @param servidores - Lista com os servidores
	 */
	public static void sort(ArrayList<GraficoDispersao> servidores){
		
		quickSort(servidores,0,servidores.size()-1);
		
	}
	/**
	 * Metodo que processa a lista
	 * @param servidores - lista com os servidores
	 * @param inicio - indice do inicio da lista
	 * @param fim - indice do fim da lista
	 */
	private static void quickSort(ArrayList<GraficoDispersao> servidores,int inicio,int fim){
		if(inicio<fim){
			int pivo = particiona(servidores,inicio, fim);
			quickSort(servidores,inicio,pivo-1);
			quickSort(servidores,pivo+1,fim);
		}
	}
	/**
	 * Metodo que busca o indice a ser o pivo do algoritmo
	 * @param servidores - lista a ser pesquisada
	 * @param inicio - indice do inicio da lista
	 * @param fim - indice do fim da lista
	 * @return - indice do pivo escolhido
	 */
	private static int particiona(ArrayList<GraficoDispersao> servidores, int inicio, int fim){
			GraficoDispersao pivo = servidores.get(inicio);
			int i = inicio + 1, f = fim;
			
			while(i<= f){
				if(servidores.get(i).getData().get(0).get(1) <= pivo.getData().get(0).get(1)){
					i++;
				}else if(pivo.getData().get(0).get(1) < servidores.get(f).getData().get(0).get(1)){
					f--;
				}else{
					GraficoDispersao serv = servidores.get(i);
					servidores.set(i, servidores.get(f));
					servidores.set(f, serv);
					i++;
					f--;
				}
				
			}
			servidores.set(inicio, servidores.get(f));
			servidores.set(f, pivo);
			return f;
	}
}
