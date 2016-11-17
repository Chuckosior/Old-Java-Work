package client.cmd;

import java.util.Scanner;

import client.MailBox;
import client.MailClient;

public class ReadInbox implements ICommand {

	@Override
	public void run(MailClient client) {
		MailBox inbox = client.getInbox();
		Scanner scanner = new Scanner(System.in);
		if (inbox.count() == 0) {
			System.out.println("Inbox is Empty");
			return;
		}
		System.out.print("Choose Message [1-" + (inbox.count()) + "]: ");
		int x = scanner.nextInt() - 1;
		if (x < 0 || x >= inbox.count()) {
			System.out
			.println("Message number " + (x + 1) + " can't be found.");
			return;
		}
		inbox.getMessage(x).show();
	}		
}


