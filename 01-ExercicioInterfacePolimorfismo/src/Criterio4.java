public class Criterio4 implements Criterio{
	int cont = 1;
	@Override
	//1 PRE 1 PFE
	public void puxa(ListaFichas l) {	
		if (!l.getPRE().isEmpty()) {
			if(cont % 2 == 0) {
					Ficha f1 = l.getPRE().get(0);
					System.out.println("Paciente PRE numero "+f1.getNumero());
					l.getPRE().remove(0);
				cont++;
			}
			else {
				Ficha f2 = l.getPFE().get(0);
				System.out.println("Paciente PFE numero "+f2.getNumero());
				l.getPFE().remove(0);
				cont++;
			}
		}
	}
}
