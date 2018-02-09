package client;

import adapter.Losango;
import component.Figura;
import composite.FiguraComposta;
import leaf.Circulo;
import leaf.Triangulo;

public class Manipulacao {

	public static void main(String[] args) {
		Editor<Figura> e = new Editor<Figura>("Figura 1");
		
		Circulo c = new Circulo(10);
		c.desenha();
		Triangulo t = new Triangulo(10,10,10,5,10);
		t.desenha();
		Losango l = new Losango(10, 6);
		l.desenha();
		
		//add ao editor
		e.addFigura(c);
		e.addFigura(t);
		e.addFigura(l);
		
		//cria figura composta
		FiguraComposta fc = new FiguraComposta("FC 1");
		fc.addFigura(new Circulo(2));
		fc.addFigura(new Triangulo(1,1,1,1,1));
		fc.addFigura(new Losango(10, 2));
		fc.desenha();
	
		//add figura composta ao editor
		e.addFigura(fc);
		
		System.out.println(e.qtdeFiguras());
		
		/* Console
		Um circulo foi desenhado
		Um triangulo foi desenhado
		Um losango foi desenhado
		Figura Composta foi desenhada com: Circulo Triangulo Losango
		4 */
	}

}
