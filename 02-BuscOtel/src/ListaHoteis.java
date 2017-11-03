import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class ListaHoteis {
	//hashmap do quarto e do hotel associado
	private ArrayList<Hotel> listaHoteis = new ArrayList<Hotel>(); 
	private HashMap<Hotel, Quarto> hoteisQuartos = new HashMap<>();
	private Ordenacao ordenacao;
	
	public ListaHoteis() {
		this.ordenacao = new OrdenacaoPreco();
	}
	
	public void addHotel(Hotel h) {
		listaHoteis.add(h);
	}
	
	public void addHotel(Hotel h, Quarto q) {
		hoteisQuartos.put(h, q);
	}

	public ArrayList<Hotel> getListaHoteis() {
		return listaHoteis;
	}
	
	public Collection<Quarto> getValueQuartos() {
		return hoteisQuartos.values();
	}
	
	public Set<Hotel> getKeyHotel() {
		return hoteisQuartos.keySet();
	}
	
	public String ordenar(){
		return ordenacao.ordenar(this);
	}

	public String ordenar(Ordenacao ordenacao){
		return ordenacao.ordenar(this);
	}
	
	
	@Override
	public String toString() {
		return "listaHoteis=" + listaHoteis + hoteisQuartos +"]";
	}
	
}
