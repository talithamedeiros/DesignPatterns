
public class Ficha {
	private int numero=0;
	private String tipo;
	
	public Ficha(String tipo) {
		this.tipo=tipo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Ficha [numero=" + numero + ", tipo=" + tipo + "]";
	}
}
