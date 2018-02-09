package leaf;

import component.Figura;

public class Circulo implements Figura{
	private float raio;
	
	public Circulo(float raio) {
		super();
		this.raio = raio;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public double perimetro() {
		return 2*3.14*raio;
	}

	@Override
	public double area() {
		return 3.14*(Math.pow(raio, 2));
	}

	@Override
	public void desenha() {
		System.out.println("Um circulo foi desenhado");
	}

	@Override
	public String toString() {
		return "Circulo";
	}

}
