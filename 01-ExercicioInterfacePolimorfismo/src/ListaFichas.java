import java.util.ArrayList;

public class ListaFichas {
	private ArrayList<Ficha> NFE = new ArrayList<Ficha>(); //NORMAL FAZER EXAME
	private ArrayList<Ficha> PFE = new ArrayList<Ficha>(); //PRIORIDADE FAZER EXAME
	private ArrayList<Ficha> NRE = new ArrayList<Ficha>(); //NORMAL RECEBER EXAME
	private ArrayList<Ficha> PRE = new ArrayList<Ficha>(); //PRIORIDADE RECEBER EXAME
	private Criterio criterio = new Criterio1(); // criterio default
	
	public void adicionarFicha(Ficha f){
		switch(f.getTipo()) {
			case "NFE":
				this.NFE.add(f);
				break;
			case "PFE":
				this.PFE.add(f);
				break;
			case "NRE":
				this.NRE.add(f);
				break;
			case "PRE":
				this.PRE.add(f);
				break;
			default: System.out.println("invalido");
			break;
		}		
	}

	public ArrayList<Ficha> getNFE() {
		return NFE;
	}
	public ArrayList<Ficha> getPFE() {
		return PFE;
	}
	public ArrayList<Ficha> getNRE() {
		return NRE;
	}
	public ArrayList<Ficha> getPRE() {
		return PRE;
	}

	public void chamarProximo(){
		criterio.puxa(this);
	}
	
	public void mudarCriterio(Criterio c) {
		criterio = c;
	}

	@Override
	public String toString() {
		return "Ficha [NFE=" + NFE + ", PFE=" + PFE + ", NRE=" + NRE + ", PRE=" + PRE + "]";
	}
}
