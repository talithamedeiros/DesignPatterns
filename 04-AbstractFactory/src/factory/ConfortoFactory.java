package factory;

import model.Comodo;
import product.Loucas;
import product.LoucasElizabeth;
import product.Metais;
import product.MetaisAluminio;
import product.Parede;
import product.ParedeAlvenaria;
import product.Piso;
import product.PisoEsmaltada;
import product.Porta;
import product.PortaMadeira;
import product.Tinta;
import product.TintaAcrilica;

public class ConfortoFactory implements CasaFactory{

	@Override
	public Piso createPiso() {
		// TODO Auto-generated method stub
		return new PisoEsmaltada();
	}

	@Override
	public Parede createParede() {
		// TODO Auto-generated method stub
		return new ParedeAlvenaria();
	}

	@Override
	public Porta createPorta() {
		// TODO Auto-generated method stub
		return new PortaMadeira();
	}

	@Override
	public Loucas createLoucas() {
		// TODO Auto-generated method stub
		return new LoucasElizabeth();
	}

	@Override
	public Metais createMetais() {
		// TODO Auto-generated method stub
		return new MetaisAluminio();
	}

	@Override
	public Tinta createTintas() {
		// TODO Auto-generated method stub
		return new TintaAcrilica();
	}

	@Override
	public Comodo createComodo() {
		// TODO Auto-generated method stub
		return new Comodo();
	}
	

}
