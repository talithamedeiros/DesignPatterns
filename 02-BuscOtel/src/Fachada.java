
public class Fachada {
	private static ListaHoteis listahoteis = new ListaHoteis();

	/* Cadastrar Hotel - Cadastra o hotel o colocando na lista de hoteis
	 * */
	public static Hotel cadastrarHotel(String nome, Cidade cidade, double distancia, Recomendacao recomendacao, double avaliacao){
		Hotel h = new Hotel(nome, cidade, distancia, recomendacao, avaliacao);
		listahoteis.addHotel(h);
		return h;
	}
	
	/* Buscar - Busca o hotel pela cidade e tipo de quarto
	 * */
	public static ListaHoteis buscar (Cidade cidade, TipoQuarto tipo) {
		ListaHoteis hoteis = new ListaHoteis();		
		
		System.out.println("Lista de Hoteis disponíveis\n\nCidade de " + cidade.getNome() + " - " + tipo + "\n");
		for (Hotel h : listahoteis.getListaHoteis()) {
			if (h.cidadeHotel(cidade)) {
				for (TipoQuarto t : h.getTipoQuartos()) {
					if (t.equals(tipo)) {						
						hoteis.addHotel(h, h.getQuartoPeloTipo(tipo));
					}
				}
			}
		}
		return hoteis;
	}
		
	//reservar - parametros: quarto escolhido
	//quarto é enviado para a lista de reservas de quarto
	public static Reserva reservar(Hotel hotel, TipoQuarto tipo) {
	
		Quarto q = hotel.getQuartoPeloTipo(tipo);
		
		Reserva reserva = new Reserva();
		reserva.addQuartos(q);
		
		return reserva;
	}
	
}
