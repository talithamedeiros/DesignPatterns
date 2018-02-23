package colleague;

import mediator.Mediator;

public class HumanParticipant extends Participant{

	public HumanParticipant(Mediator m) {
		super(m);
	}
	
	@Override
	public void receberMensagem(String msg) {
		System.out.println("Human participant recebeu:" + msg);	
	}
	

}
