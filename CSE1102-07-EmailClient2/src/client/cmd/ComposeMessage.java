package client.cmd;

import java.util.Scanner;

import client.Contact;
import client.MailClient;
import client.Message;

public class ComposeMessage implements ICommand {


	@Override
	public void run(MailClient client) {
		Scanner scanner = new Scanner(System.in);
		Contact c = null;
		while (c == null) {
			System.out.print("Email/Nick: ");
			String sendTo = scanner.nextLine();
			if (sendTo.contains("@")) {
				c = new Contact(sendTo);
			} else {
				c = client.getAddressBook().search(sendTo);
			}
		}
		System.out.println("Sending To: " + c);
		System.out.print("Subject: ");
		String subj = scanner.nextLine();
		System.out.print("Body: ");
		String body = scanner.nextLine();

		Message mesg = new Message(client.getMyAddress(), c, subj, body);
		client.addToOutbox(mesg);
		System.out.println("Message Queued For Delivery");
	}

}

