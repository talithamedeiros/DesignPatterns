import java.util.ArrayList;

public class Hotel {
	private String nome;
	private Cidade cidade;
	private double distancia;
	private Recomendacao recomendacao;
	private double avaliacao;
	private ArrayList<Quarto> listaQuartos = new ArrayList<Quarto>(); 
	
	public Hotel(String nome, Cidade cidade, double distancia, Recomendacao recomendacao, double avaliacao) {
		this.nome = nome;
		this.cidade = cidade;
		this.distancia = distancia;
		this.recomendacao = recomendacao;
		this.avaliacao = avaliacao;
	}

	public void addQuartos(TipoQuarto t, double preco, int numero) {
		Quarto q = new Quarto(t, preco, numero);
		listaQuartos.add(q);
	}
 
	public String getNome() {
		return nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public double getDistancia() {
		return distancia;
	}

	public Recomendacao getRecomendacao() {
		return recomendacao;
	}

	public double getAvaliacao() {
		return avaliacao;
	}
	
	public ArrayList<TipoQuarto> getTipoQuartos(){
		ArrayList<TipoQuarto> tipos = new ArrayList<TipoQuarto>();
		for (Quarto q : listaQuartos){
			tipos.add(q.getTipo());
		}
		return tipos;
	}
	
	public Quarto getQuartoPeloTipo(TipoQuarto tipo) {
		for (Quarto q : listaQuartos){
			if (q.getTipo().equals(tipo)) {
				return q;
			}
		}
		return null;
	}
	
	public boolean cidadeHotel (Cidade cid) {
		if (this.cidade.equals(cid)){
			return true;
		}
		else return false;
	}

	@Override
	public String toString() {
		return "Hotel [nome=" + nome + ", cidade=" + cidade + ", distancia=" + distancia + ", recomendacao="
				+ recomendacao + ", avaliacao=" + avaliacao + "]";
	}
	
	
}
