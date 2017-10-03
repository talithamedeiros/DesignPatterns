public class Teste {

	public static void main(String[] args) {
		int numero = 1;
		
		Ficha f1 = new Ficha("NRE");
		Ficha f2 = new Ficha("NRE");
		Ficha f3 = new Ficha("NFE");
		Ficha f4 = new Ficha("NRE");
		Ficha f5 = new Ficha("PRE");
		Ficha f6 = new Ficha("PFE");
		
		ListaFichas lista = new ListaFichas();
		
		//Add fichas na lista
		lista.adicionarFicha(f1);
		f1.setNumero(numero++);
		lista.adicionarFicha(f2);
		f2.setNumero(numero++);
		lista.adicionarFicha(f3);
		f3.setNumero(numero++);
		lista.adicionarFicha(f4);
		f4.setNumero(numero++);
		lista.adicionarFicha(f5);
		f5.setNumero(numero++);
		lista.adicionarFicha(f6);
		f6.setNumero(numero++);
		
		//Chamar próximo
		lista.chamarProximo();
		lista.chamarProximo();	
		lista.chamarProximo();	
		lista.chamarProximo();	
		System.out.println(lista);
			
		//Altera criterio
		Criterio criterio = new Criterio4();
		lista.mudarCriterio(criterio);
		
		lista.chamarProximo();
		lista.chamarProximo();
		lista.chamarProximo();
		System.out.println(lista);
		
//		Criterio criterio2 = new Criterio2();
//		lista.mudarCriterio(criterio2);
//		lista.chamarProximo();
//		
//		Criterio criterio3 = new Criterio3();
//		lista.mudarCriterio(criterio3);
//		lista.chamarProximo();
	}

}
