package client.cmd;

import client.MailClient;

public class Help implements ICommand{

	public void run(MailClient client) {
		// TODO Auto-generated method stub

		System.out.println("List of possible commands: ");
		System.out.println("la: list address book");
		System.out.println("li: list inbox");
		System.out.println("lo: list outbox");
		System.out.println("aa: add to address book");
		System.out.println("da: delete from address book");
		System.out.println("cm: compose message");
		System.out.println("ro: read outbox message");
		System.out.println("do: delete outbox message");
		System.out.println("sr: send and recieve");
		System.out.println("ri: read inbox message");
		System.out.println("di: delete inbox message");

	}
}

