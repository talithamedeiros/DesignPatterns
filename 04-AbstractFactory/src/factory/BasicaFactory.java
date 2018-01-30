package factory;

import model.Comodo;
import product.Loucas;
import product.LoucasBaratas;
import product.Metais;
import product.MetaisFerro;
import product.Parede;
import product.ParedeGesso;
import product.Piso;
import product.PisoCeramica;
import product.Porta;
import product.PortaMdf;
import product.Tinta;
import product.TintaLatex;

public class BasicaFactory implements CasaFactory{

	@Override
	public Piso createPiso() {
		return new PisoCeramica();
	}

	@Override
	public Parede createParede() {
		// TODO Auto-generated method stub
		return new ParedeGesso();
	}

	@Override
	public Porta createPorta() {
		// TODO Auto-generated method stub
		return new PortaMdf();
	}

	@Override
	public Loucas createLoucas() {
		// TODO Auto-generated method stub
		return new LoucasBaratas();
	}

	@Override
	public Metais createMetais() {
		// TODO Auto-generated method stub
		return new MetaisFerro();
	}

	@Override
	public Tinta createTintas() {
		// TODO Auto-generated method stub
		return new TintaLatex();
	}

	@Override
	public Comodo createComodo() {
		// TODO Auto-generated method stub
		return new Comodo();
	}

	

}
