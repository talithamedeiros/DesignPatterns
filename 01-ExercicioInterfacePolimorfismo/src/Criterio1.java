public class Criterio1 implements Criterio{
	int cont = 1;
	@Override
	//3 NRE 1 NFE
	public void puxa(ListaFichas l) {	
		if (!l.getNFE().isEmpty()) {
			if(cont % 4 == 0) {
					Ficha f1 = l.getNFE().get(0);
					System.out.println("Paciente NFE numero "+f1.getNumero());
					l.getNFE().remove(0);
				cont++;
			}
			else {
				if(!l.getNRE().isEmpty()) {
					Ficha f2 = l.getNRE().get(0);
					System.out.println("Paciente NRE numero "+f2.getNumero());
					l.getNRE().remove(0);
					cont++;
				}
			}
		}
	}
}

