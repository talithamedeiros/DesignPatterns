package client;

import java.util.ArrayList;
import java.util.List;

import component.Figura;

public class Editor <T extends Figura>{
	private List<T> figuras;
	private String nome;
	
	public Editor(String nome) {
		super();
		this.nome = nome;
		this.figuras = new ArrayList<T>();
	}
	
	public void addFigura(T f) {
		figuras.add(f);
	}	
	
	public int qtdeFiguras() {
		return figuras.size();
	}
}
