
public class Quarto {
	private double preco;
	private int numero;
	private TipoQuarto tipo;
	
	public Quarto(TipoQuarto tipo, double preco, int numero) {
		this.preco = preco;
		this.tipo = tipo;
		this.numero = numero;
	}

	public double getPreco() {
		return preco;
	}
	
	public TipoQuarto getTipo() {
		return tipo;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Quarto [preco=" + preco + ", numero=" + numero + ", tipo=" + tipo + "]";
	}	
	
}
