package leaf;

import component.Figura;

public class Triangulo implements Figura {
	private double l1, l2, l3, altura, base;
	
	public Triangulo(float l1, float l2, float l3, float base, float altura) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.base = base;
		this.altura = altura;
	}

	public double getL1() {
		return l1;
	}

	public void setL1(float l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(float l2) {
		this.l2 = l2;
	}

	public double getL3() {
		return l3;
	}

	public void setL3(float l3) {
		this.l3 = l3;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public double perimetro() {		
		return l1+l2+l3;
	}

	@Override
	public double area() {
		return (base*altura)/2;		
	}

	@Override
	public void desenha() {
		System.out.println("Um triangulo foi desenhado");
	}

	@Override
	public String toString() {
		return "Triangulo";
	}

}
