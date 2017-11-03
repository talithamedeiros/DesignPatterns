
public class Main {

	public Main() {
		try {	
			Cidade jpa = new Cidade("João Pessoa");
			Hotel hoteljpa = Fachada.cadastrarHotel("Hotel João Pessoa", jpa, 54.3, Recomendacao.bom, 8);
			Hotel hotelrec = Fachada.cadastrarHotel("Hotel Recife", jpa, 20.2, Recomendacao.otimo, 8.2);
			
			hoteljpa.addQuartos(TipoQuarto.single,  100.0, 100);
			hoteljpa.addQuartos(TipoQuarto.duplo,  200.5, 200);
			hotelrec.addQuartos(TipoQuarto.duplo,  200.0, 200);
			
			ListaHoteis hoteis = Fachada.buscar(jpa, TipoQuarto.duplo);	
			
			System.out.print(hoteis.ordenar());
			
			System.out.print(hoteis.ordenar(new OrdenacaoRecomendacao()));
			
			System.out.print(hoteis.ordenar(new OrdenacaoDistancia()));
			
			Reserva reserva = Fachada.reservar(hoteljpa, TipoQuarto.duplo);
			
			reserva.pagar(new PagamentoBoleto());
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


//  ***********************************************
	public static void main (String[] args)   
//  ***********************************************
	{
		new Main();
	}
	
}