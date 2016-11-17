package client.cmd;

import java.util.Scanner;

import client.MailBox;
import client.MailClient;

public class DeleteOutbox implements ICommand{

	@Override
	public void run(MailClient client) {
		MailBox outbox = client.getOutbox();
		Scanner scanner = new Scanner(System.in);
		if (outbox.count() == 0) {
			System.out.println("Outbox Empty");
			return;
		}
		System.out.print("Choose Message [1-" + (outbox.count()) + "]: ");
		int x = scanner.nextInt() - 1;
		if (x < 0 || x >= outbox.count()) {
			System.out
			.println("Message number " + (x + 1) + " can't be found.");
			return;
		}
		outbox.remove(x);
		System.out.println("Message Deleted");
	}		
}


