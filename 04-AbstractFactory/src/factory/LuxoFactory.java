package factory;

import model.Comodo;
import product.Loucas;
import product.LoucasDeca;
import product.Metais;
import product.MetaisInox;
import product.Parede;
import product.ParedeDryWall;
import product.Piso;
import product.PisoPorcelanato;
import product.Porta;
import product.PortaMadeiraLei;
import product.Tinta;
import product.TintaSuperlavavel;

public class LuxoFactory implements CasaFactory{

	@Override
	public Piso createPiso() {
		// TODO Auto-generated method stub
		return new PisoPorcelanato();
	}

	@Override
	public Parede createParede() {
		// TODO Auto-generated method stub
		return new ParedeDryWall();	
	}

	@Override
	public Porta createPorta() {
		// TODO Auto-generated method stub
		return new PortaMadeiraLei();
	}

	@Override
	public Loucas createLoucas() {
		// TODO Auto-generated method stub
		return new LoucasDeca();
	}

	@Override
	public Metais createMetais() {
		// TODO Auto-generated method stub
		return new MetaisInox();
	}

	@Override
	public Tinta createTintas() {
		// TODO Auto-generated method stub
		return new TintaSuperlavavel();
	}

	@Override
	public Comodo createComodo() {
		// TODO Auto-generated method stub
		return new Comodo();
	}


}
