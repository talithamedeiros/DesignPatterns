package colleague;

import mediator.Mediator;

public class Robot extends Participant{

	public Robot(Mediator m) {
		super(m);
	}
	
	@Override
	public void receberMensagem(String msg) {
		System.out.println("Robot recebeu:" + msg);
		
	}
}
