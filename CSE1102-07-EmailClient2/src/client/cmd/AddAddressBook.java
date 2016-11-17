package client.cmd;

import java.util.Scanner;

import client.Contact;
import client.MailClient;

public class AddAddressBook implements ICommand{

	@Override
	public void run(MailClient client) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Full Name: ");
		String nm = scanner.nextLine();
		System.out.print("Nick Name: ");
		String nick = scanner.nextLine();
		Contact c = new Contact(email, nm, nick);
		client.getAddressBook().add(c);		
	}

}
