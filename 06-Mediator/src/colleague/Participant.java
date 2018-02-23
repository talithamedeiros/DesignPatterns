package colleague;

import mediator.Mediator;

public abstract class Participant {
	private Mediator mediator;
	
	public Participant(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void enviarMensagem(String msg, Participant remetente) {
		mediator.enviarMensagem(msg, remetente);
	}
	
	public abstract void receberMensagem(String msg);
}
