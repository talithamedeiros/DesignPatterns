package adapter;

import adaptee.FiguraInternet;
import component.Figura;

public class Quadrado implements Figura{
	private FiguraInternet figura;
	private double lado, altura;
	
	public Quadrado(double lado, double altura) {
		super();
		this.altura=altura;
		this.lado=lado;
		figura = new FiguraInternet();
	}

	@Override
	public double perimetro() {
		return 4*altura;
	}

	@Override
	public double area() {
		return figura.area();
	}

	@Override
	public void desenha() {
		System.out.println("Um Quadrado " + figura.desenharFigura());
	}
	
	public void volume() {
		this.figura.volume();
	}

	@Override
	public String toString() {
		return "Quadrado";
	}
}