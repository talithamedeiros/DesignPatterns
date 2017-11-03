
public class OrdenacaoRecomendacao implements Ordenacao{
	//traz nome do hotel e recomendação
	public String ordenar(ListaHoteis hoteis){
		String hoteisRecomendacao = new String();
		
		hoteisRecomendacao+="\nHotel: ";
		
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisRecomendacao = hoteisRecomendacao + h.getNome() + " | ";
		}
		hoteisRecomendacao+="\nRecomendação: ";
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisRecomendacao = hoteisRecomendacao + h.getRecomendacao() + " | ";
		}
		
		return hoteisRecomendacao;
	}
}
