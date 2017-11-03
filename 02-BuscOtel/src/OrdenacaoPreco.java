
class OrdenacaoPreco implements Ordenacao{
	
	//traz nome do hotel e preço
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
		hoteisPreco+="\nAvaliação: ";
		for(Hotel h : hoteis.getKeyHotel()) {
			hoteisPreco = hoteisPreco + h.getAvaliacao() + " | ";	
		}
		
		return hoteisPreco;
	}
}
