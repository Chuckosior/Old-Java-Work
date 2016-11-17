package client.cmd;

import client.MailClient;

public class ListInbox implements ICommand{

	public void run(MailClient client){
		
		client.getInbox().show();
		}
}
