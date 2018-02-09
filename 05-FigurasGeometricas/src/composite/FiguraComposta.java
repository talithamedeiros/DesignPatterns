package composite;

import java.util.ArrayList;
import java.util.List;

import component.Figura;

public class FiguraComposta implements Figura{
	private String nome;	
	private List<Figura> figuras;
	
	public FiguraComposta(String nome) {
		super();
		this.nome = nome;
		this.figuras = new ArrayList<Figura>();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void desenha() {
		String figura = new String();
		
		for (Figura f : figuras) {
	    	if (!figuras.isEmpty()) {
	    		figura+=" "+f;
	    	}
	    }
		
		System.out.println("Figura Composta foi desenhada com:" + figura);		
	}
	
	public void addFigura(Figura f) {
		figuras.add(f);
	}

	public List<Figura> getFiguras() {
		return figuras;
	}	
}
