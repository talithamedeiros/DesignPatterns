package factory;

import model.Comodo;
import product.Loucas;
import product.Metais;
import product.Parede;
import product.Piso;
import product.Porta;
import product.Tinta;

public interface CasaFactory {
	public Piso createPiso();
	public Parede createParede();
	public Porta createPorta();
	public Loucas createLoucas();
	public Metais createMetais();
	public Tinta createTintas();
	public Comodo createComodo();
}
