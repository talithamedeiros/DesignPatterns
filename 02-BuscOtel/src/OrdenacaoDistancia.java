
public class OrdenacaoDistancia implements Ordenacao{
	
	//traz nome do hotel e distancia
	public String ordenar(ListaHoteis hoteis){
		String hoteisDistancia = new String();
		
		hoteisDistancia+="\nHotel: ";
		
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisDistancia = hoteisDistancia + h.getNome() + " | ";
		}
		hoteisDistancia+="\nDist�ncia: ";
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisDistancia = hoteisDistancia + h.getDistancia() + " | ";
		}
		
		return hoteisDistancia;
	}
}