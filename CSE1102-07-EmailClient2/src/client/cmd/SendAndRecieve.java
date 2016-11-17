package client.cmd;

import client.MailClient;
import client.Message;

public class SendAndRecieve implements ICommand {
	public void run(MailClient client)
	{
		System.out.println("Done");
		while (client.getOutbox().count() > 0) {
			Message m = client.getOutbox().remove(0);
			client.getInbox().add(m);
		}
	}
}