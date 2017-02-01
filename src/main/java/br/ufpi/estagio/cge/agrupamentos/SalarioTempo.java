package br.ufpi.estagio.cge.agrupamentos;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.estagio.cge.dao.CargoDAO;
import br.ufpi.estagio.cge.grafico.Dados;
import br.ufpi.estagio.cge.grafico.GraficoDispersao;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.core.Instances;


public class SalarioTempo extends GenericKMeans{	

	public static void main(String[] args) throws Exception
	{
		Dados dados = new Dados();
		dados.setInput1("medico");
		dados.setInput2("");
		dados.setInput3("");
		dados.setTipoSalario("bruto");
		dados.setReferencia("201604");
		List<GraficoDispersao> grafico = CargoDAO.graficoDispersaoSalarioPorTempo(dados);
		List<Double> tempoCargo = new ArrayList<Double>();
		List<Double> salario = new ArrayList<Double>();

		for (GraficoDispersao aux: grafico) {
			tempoCargo.add(aux.getData().get(0).get(0));
			salario.add(aux.getData().get(0).get(1));
		}

		Instances instancesTempoCargo = iniciaInstancias(tempoCargo, "Tempo Cargo");
		Instances instancesSalario = iniciaInstancias(salario, "Salario");

		//imprimindo todas as instacias
		System.out.println("======================Tempo Cargo====================");
		System.out.println(instancesTempoCargo.toString());
		System.out.println("======================Salario====================");
		System.out.println(instancesSalario.toString());

		//contruindo os clusteres de tempoCargo
		SimpleKMeans simpleKMeansCargo = new SimpleKMeans();		
		simpleKMeansCargo.setPreserveInstancesOrder(true);
		simpleKMeansCargo.setSeed(8);
		simpleKMeansCargo.setNumClusters(8);        
		simpleKMeansCargo.buildClusterer(instancesTempoCargo);

		//contruindo os clusteres de salario
		SimpleKMeans simpleKMeansSalario = new SimpleKMeans();		
		simpleKMeansSalario.setPreserveInstancesOrder(true);
		simpleKMeansSalario.setSeed(6);
		simpleKMeansSalario.setNumClusters(6);        
		simpleKMeansSalario.buildClusterer(instancesSalario);

		//analisando os clusteres de tempoCargo
		ClusterEvaluation evalCargo = new ClusterEvaluation();
		evalCargo.setClusterer(simpleKMeansCargo);		
		evalCargo.evaluateClusterer(new Instances(instancesTempoCargo));	

		//analisando os clusteres de salario
		ClusterEvaluation evalSalario = new ClusterEvaluation();
		evalSalario.setClusterer(simpleKMeansSalario);		
		evalSalario.evaluateClusterer(new Instances(instancesSalario));	

		//imprimindo as analises
		System.out.println(evalSalario.clusterResultsToString());
		System.out.println(evalCargo.clusterResultsToString());

		//acha o maior centroide de salario		
		int numeroClusterSalario = maiorMenorCluster(simpleKMeansSalario, 1);		

		//acha o menor centroide de tempoCargo
		int numeroClusterCargo = maiorMenorCluster(simpleKMeansCargo, 2);


		List<Integer> instanciasCargo = new ArrayList<Integer>();
		List<Integer> instanciasIntersecao = new ArrayList<Integer>();

		int[] assigmets = simpleKMeansCargo.getAssignments();		

		instanciasCargo = instanciasCluster(assigmets, numeroClusterCargo);

		int[] assigmetsSalario = simpleKMeansSalario.getAssignments();

		instanciasIntersecao = instanciasIntersecao(assigmetsSalario, instanciasCargo, numeroClusterSalario);

		System.out.println("======================Ganham muito e trabalharam pouco=====================");		

		for (int i : instanciasIntersecao) {
			System.out.print("Instancia "+i+" Valores -> ");
			System.out.print("Tempo no cargo "+instancesTempoCargo.get(i)+", ");
			System.out.print("Salario "+instancesSalario.get(i));
			System.out.println();
		}

	}

}
