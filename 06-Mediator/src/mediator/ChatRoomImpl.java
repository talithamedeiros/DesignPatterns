package mediator;

import java.util.ArrayList;

import colleague.HumanParticipant;
import colleague.Participant;
import colleague.Robot;

public class ChatRoomImpl implements Mediator{
	private ArrayList<Participant> participantes;
	
	
	public ChatRoomImpl() {
		this.participantes = new ArrayList<Participant>();
	}

	public void addParticipant(Participant p) {
		participantes.add(p);
	}

	public void enviarMensagem(String mensagem, Participant participante) {
		for (Participant p : participantes) {
			if (p == participante) {
				mensagemPara(participante);
				p.receberMensagem(mensagem);				
			}
		}
	}
	
	private void mensagemPara (Participant participante) {
		if (participante instanceof HumanParticipant) {
			System.out.println("Human participant");
		} else if (participante instanceof Robot) {
			System.out.println("Robot");
		}
	}

}
