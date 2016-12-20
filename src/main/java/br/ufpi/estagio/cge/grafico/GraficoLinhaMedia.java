package br.ufpi.estagio.cge.grafico;

import java.util.ArrayList;
/**
 * 
 * @author Irvayne Matheus
 *
 */
public class GraficoLinhaMedia {
	
	private String type;
	private String name;
	private ArrayList<ArrayList<Double>> data;
	
	public GraficoLinhaMedia(){}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<ArrayList<Double>> getData() {
		return data;
	}

	public void setData(ArrayList<ArrayList<Double>> data) {
		this.data = data;
	}
	
	

}
