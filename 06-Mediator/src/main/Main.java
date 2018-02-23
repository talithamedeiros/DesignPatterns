package main;

import colleague.HumanParticipant;
import colleague.Robot;
import mediator.ChatRoomImpl;

public class Main {

	public static void main(String[] args) {
		ChatRoomImpl chat = new ChatRoomImpl();
		
		HumanParticipant hp = new HumanParticipant(chat);
		Robot rob = new Robot(chat);
		
		chat.addParticipant(hp);
		chat.addParticipant(rob);
		
		hp.enviarMensagem("mensagem 1", hp);
		hp.enviarMensagem("mensagem 2", rob);
	}

}
