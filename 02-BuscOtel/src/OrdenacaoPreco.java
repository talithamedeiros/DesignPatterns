
class OrdenacaoPreco implements Ordenacao{
	
	//traz nome do hotel e pre�o
	public String ordenar(ListaHoteis hoteis){
		
		String hoteisPreco = new String();
		
		hoteisPreco+="\nHotel: ";
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisPreco = hoteisPreco + h.getNome() + " | ";	
		}
		hoteisPreco+="\nValor: ";
		
		for (Quarto q : hoteis.getValueQuartos()) {
			hoteisPreco = hoteisPreco + q.getPreco() + " | ";
		}
		hoteisPreco+="\nAvalia��o: ";
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisPreco = hoteisPreco + h.getAvaliacao() + " | ";	
		}
		
		return hoteisPreco;
	}
}
