
public class OrdenacaoRecomendacao implements Ordenacao{
	//traz nome do hotel e recomenda��o
	public String ordenar(ListaHoteis hoteis){
		String hoteisRecomendacao = new String();
		
		hoteisRecomendacao+="\nHotel: ";
		
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisRecomendacao = hoteisRecomendacao + h.getNome() + " | ";
		}
		hoteisRecomendacao+="\nRecomenda��o: ";
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisRecomendacao = hoteisRecomendacao + h.getRecomendacao() + " | ";
		}
		
		return hoteisRecomendacao;
	}
}
