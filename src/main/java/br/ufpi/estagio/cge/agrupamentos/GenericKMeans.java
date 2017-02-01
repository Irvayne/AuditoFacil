package br.ufpi.estagio.cge.agrupamentos;

import java.util.ArrayList;
import java.util.List;

import weka.clusterers.SimpleKMeans;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

public class GenericKMeans {
	public static Instances iniciaInstancias(List<Double> array, String nome) throws Exception
	{
		ArrayList<Attribute> attributes = new ArrayList<Attribute>();
		Attribute attribute = new weka.core.Attribute(nome);
		attributes.add(attribute);
		Instances test = new Instances("servidor", attributes, 0);		

		for (Double valor : array) {
			Instance inst = new DenseInstance(1);
			inst.setValue(attribute, valor);
			test.add(inst);
		}		

		return test;
	}

	/**
	 * Use 1 para achar o maior e qualquer outro numero para achar o menor
	 * @param kmeans
	 * @param maiorMenor
	 * @return
	 */
	public static int maiorMenorCluster(SimpleKMeans kmeans, int maiorMenor){

		int i = 0, numeroCluster = 0;

		if (maiorMenor == 1) {
			Double maior = 0.0;					

			for (Instance instance : kmeans.getClusterCentroids()) {			
				if (Double.parseDouble(instance.toString()) > maior) {
					maior = Double.parseDouble(instance.toString());
					numeroCluster = i;
				}			
				i++;
			}

			return numeroCluster;
		}else{
			Double menor = 10000.0;					
			for (Instance instance : kmeans.getClusterCentroids()) {			
				if (Double.parseDouble(instance.toString()) < menor) {
					menor = Double.parseDouble(instance.toString());
					numeroCluster = i;
				}			
				i++;
			}

			return numeroCluster;
		}		
	}

	/**
	 * Devolve uma lista com o numero das instancias de um certo cluster
	 * @param assigmets
	 * @param numeroCluster
	 * @return
	 */
	public static List<Integer> instanciasCluster(int[] assigmets,int numeroCluster){
		List<Integer> instancias = new ArrayList<Integer>();
		int instancia = 0;
		for (int numero : assigmets) {
			if (numero == numeroCluster) {
				instancias.add(instancia);				
			}			
			instancia++;
		}

		return instancias;
	}

	/**
	 * Devolve uma lista com os número das instancias que estão em uma lista e um assigments
	 * @param assigmets
	 * @param assigmets2
	 * @param numeroCluster
	 * @return
	 */
	public static List<Integer> instanciasIntersecao(int[] assigmets,List<Integer> assigmets2, int numeroCluster){
		List<Integer> instancias = new ArrayList<Integer>();
		int instancia = 0;		
		for (int numero : assigmets) {
			if (numero == numeroCluster) {				
				for (int j : assigmets2) {
					if (instancia == j) {
						instancias.add(instancia);
					}
				}
			}			
			instancia++;
		}

		return instancias;
	}
}
