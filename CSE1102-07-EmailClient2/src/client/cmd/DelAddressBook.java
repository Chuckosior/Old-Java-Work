package client.cmd;

import java.util.Scanner;

import client.MailClient;

public class DelAddressBook implements ICommand {

	public void run(MailClient client)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nick Name: ");
		String nick = scanner.nextLine();
		if (client.getAddressBook().remove(nick) == null) {
			System.out.println("Contact Does Not Exist");
		}
	}
}
