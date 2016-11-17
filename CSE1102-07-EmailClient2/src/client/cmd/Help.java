package client.cmd;

import client.MailClient;


public class Help implements ICommand {

	@Override
	public void run(MailClient client) {
	
		System.out.println("h   Show Help Menu");
		System.out.println("la  List Address Book Contacts");
		System.out.println("li  List Inbox Messages");
		System.out.println("lo  List Outbox Messages");
		System.out.println("aa  Add Address Book Contact");
		System.out.println("da  Delete Address Book Contact");
		System.out.println("cm  Compose Message");
		System.out.println("ro  Read Outbox Message");
		System.out.println("do  Delete Outbox Message");
		System.out.println("ri  Read Inbox Message");
		System.out.println("di  Delete Inbox Message");
		System.out.println("sr  Syncronize With Mail Server");
		System.out.println("q   Quit Mail Client");
		
	}

}
