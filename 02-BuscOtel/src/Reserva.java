
import java.util.ArrayList;

public class Reserva {
	private ArrayList<Quarto> quartosReservados = new ArrayList<Quarto>();

	public void addQuartos(Quarto q) {
		this.quartosReservados.add(q);
	}
	
	public void pagar (Pagamento pag) {
		pag.pagar(this);
	}

	@Override
	public String toString() {
		return "Reserva [quartosReservados=" + quartosReservados + "]";
	}	
}
