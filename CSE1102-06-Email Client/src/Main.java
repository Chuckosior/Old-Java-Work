import client.*;

public class Main {

	public static void main(String[] args) {

		Contact me = new Contact("Kosior3cs@gmail.com", "Chris Kosior", "Chris");
		MailClient client1 = new MailClient(me);
		CmdLoop command = new CmdLoop(client1);
		command.run();
	}

}
