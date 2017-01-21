package br.ufpi.estagio.cge.teste.testeUnitario;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.NominalPrediction;
import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.rules.DecisionTable;
import weka.classifiers.rules.PART;
import weka.classifiers.trees.DecisionStump;
import weka.classifiers.trees.J48;
import weka.core.FastVector;
import weka.core.Instances;
import weka.experiment.InstanceQuery;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;
 
public class J48Test {
	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;
 
		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}
 
		return inputReader;
	}
 
	public static Evaluation classify(Classifier model,
			Instances trainingSet, Instances testingSet) throws Exception {
		Evaluation evaluation = new Evaluation(trainingSet);
 
		model.buildClassifier(trainingSet);
		evaluation.evaluateModel(model, testingSet);
 
		return evaluation;
	}
 
	public static double calculateAccuracy(FastVector predictions) {
		double correct = 0;
 
		for (int i = 0; i < predictions.size(); i++) {
			NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
			if (np.predicted() == np.actual()) {
				correct++;
			}
		}
 
		return 100 * correct / predictions.size();
	}
 
	public static Instances[][] crossValidationSplit(Instances data, int numberOfFolds) {
		Instances[][] split = new Instances[2][numberOfFolds];
 
		for (int i = 0; i < numberOfFolds; i++) {
			split[0][i] = data.trainCV(numberOfFolds, i);
			split[1][i] = data.testCV(numberOfFolds, i);
		}
 
		return split;
	}
 
	public static void main(String[] args) throws Exception {
//		InstanceQuery query = new InstanceQuery();
//		 query.setDatabaseURL("jdbc:mysql://localhost/infofolha_cge");
//		 query.setUsername("root");
//		 query.setPassword("root");
//		 query.setQuery("select cargo_descricao,orgao_descricao from servidor where (cargo_descricao = 'medico' or cargo_descricao = 'vigia') and referencia = 201604 and nome like 'ANA%'");
//		 
//		 Instances data = query.retrieveInstances();
		

		BufferedReader datafile = readDataFile("weather.txt");		 
		Instances data = new Instances(datafile);
		
		data.setClassIndex(data.numAttributes() - 1);
		
		// You can declare that your data set is sparse
		 
		 
		 System.out.println(data);
		data.setClassIndex(data.numAttributes() - 1);
 
		// Do 10-split cross validation
		Instances[][] split = crossValidationSplit(data, data.size());
 
		// Separate split into training and testing arrays
		Instances[] trainingSplits = split[0];
		Instances[] testingSplits = split[1];
 
		// Use a set of classifiers
		
			J48 j48 = new J48(); //one-level decision tree
		
 
		// Run for each model
		
 
			// Collect every group of predictions for current model in a FastVector
			FastVector predictions = new FastVector();
 
			// For each training-testing split pair, train and test the classifier
			for (int i = 0; i < trainingSplits.length; i++) {
				Evaluation validation = classify(j48, trainingSplits[i], testingSplits[i]);
 
				predictions.appendElements(validation.predictions());
 
				// Uncomment to see the summary for each training-testing pair.
				}
			System.out.println(j48.toString());
			
			
			// Calculate overall accuracy of current classifier on all splits
			double accuracy = calculateAccuracy(predictions);
 
			// Print current classifier's name and accuracy in a complicated,
			// but nice-looking way.
			System.out.println("Accuracy of " + j48.getClass().getSimpleName() + ": "
					+ String.format("%.2f%%", accuracy)
					+ "\n---------------------------------");
			
			
			// display classifier
		     final javax.swing.JFrame jf = 
		       new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
		     jf.setSize(500,400);
		     jf.getContentPane().setLayout(new BorderLayout());
		     TreeVisualizer tv = new TreeVisualizer(null,
		         j48.graph(),
		         new PlaceNode2());
		     jf.getContentPane().add(tv, BorderLayout.CENTER);
		     jf.addWindowListener(new java.awt.event.WindowAdapter() {
		       public void windowClosing(java.awt.event.WindowEvent e) {
		         jf.dispose();
		       }
		     });

		     jf.setVisible(true);
		     tv.fitToScreen();
		
			
			
			 FilteredClassifier fc = new FilteredClassifier();
				
			 
			 fc.setClassifier(j48);
			 // train and make predictions
			 fc.buildClassifier(data);
			 for (int i = 0; i < data.numInstances(); i++) {
			   double pred = fc.classifyInstance(data.instance(i));
			   System.out.print("REGISTRO: " + data.instance(i));
			   System.out.print(", ATUAL: " + data.classAttribute().value((int) data.instance(i).classValue()));
			   System.out.println(", PREDICAO: " + data.classAttribute().value((int) pred));
			 }
			
			
			 
 
	}
}