package br.ufpi.estagio.cge.grafico;

import java.util.List;
/**
 * 
 * @author Irvayne Matheus
 *
 */
public class GraficoLinha {
	
	private String type;
	private String name;
	private List<Double> data;
	
	public GraficoLinha(){}
	
	public GraficoLinha(String nome, List<Double> data){
		this.name = nome;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getData() {
		return data;
	}

	public void setData(List<Double> data) {
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
