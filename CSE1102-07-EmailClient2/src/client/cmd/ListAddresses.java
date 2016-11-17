package client.cmd;

import client.MailClient;

public class ListAddresses implements ICommand {
	public void run(MailClient client){

		client.getAddressBook().show();
	}
}

