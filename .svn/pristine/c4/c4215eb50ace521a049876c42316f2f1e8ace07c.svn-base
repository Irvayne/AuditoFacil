package br.ufpi.estagio.cge.teste.testeUnitario;

import java.io.BufferedReader;
import java.util.List;

import br.ufpi.estagio.cge.dao.CargoDAO;
import br.ufpi.estagio.cge.grafico.Dados;
import br.ufpi.estagio.cge.grafico.GraficoDispersao;
import weka.classifiers.meta.FilteredClassifier;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.FastVector;
import weka.core.Instances;

public class ClusterTest {
	
	public static Instances buildArff(double[][] array) throws Exception
	  {
	         FastVector      atts = new FastVector();
	         atts.addElement(new Attribute("tempoCargo")); //latitude
	         atts.addElement(new Attribute("salario")); //longitude

	         // 2. create Instances object
	         Instances test = new Instances("servidor", atts, 0);

	         // 3. fill with data
	         for(int s1=0; s1 < array[0].length; s1=s1+1)
	         {
	             double vals[] = new double[test.numAttributes()];
	             vals[0] = array[0][s1];
	             vals[1] = array[1][s1];
	             test.add(new DenseInstance(1.0, vals));
	         }

	         return(test);
	  }

    public static void main(String[] args) throws Exception
    {
    	Dados dados = new Dados();
    	dados.setInput1("medico");
    	dados.setInput2("");
    	dados.setInput3("");
    	dados.setTipoSalario("bruto");
    	dados.setReferencia("201604");
    	List<GraficoDispersao> grafico = CargoDAO.graficoDispersaoSalarioPorTempo(dados);
    	double[] one= new double[grafico.size()];
        double[] two= new double[grafico.size()];
    	
        int i = 0;
        for(GraficoDispersao aux: grafico){
    		one[i] = aux.getData().get(0).get(0);
    		two[i] = aux.getData().get(0).get(1);
    		i = i + 1;
    	}
    		
    	
        
        double[][] both=new double[2][grafico.size()];
        both[0]=one;
        both[1]=two;

        Instances instances=ClusterTest.buildArff(both);
    	
    	//BufferedReader datafile = WekaTest.readDataFile("weather.txt");		 
		//Instances instances = new Instances(datafile);
    	
        System.out.println(instances.toString());
        
        SimpleKMeans simpleKMeans = new SimpleKMeans();
        simpleKMeans.setNumClusters(10);
        simpleKMeans.buildClusterer(instances);

        ClusterEvaluation eval = new ClusterEvaluation();
        eval.setClusterer(simpleKMeans);
        eval.evaluateClusterer(new Instances(instances));

        System.out.println(eval.clusterResultsToString());
      
        
        
        
    }



}
