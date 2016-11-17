package client;

//HW 07: Email Client2
//CSE1102 Project 06, Spring 2015
//Chris Kosior
//5/2/2015
//TA: Yusuf Albayram
//Section: 12
//Instructor: Jeffrey A. Meunier


import java.util.Hashtable;
import java.util.Scanner;

import client.cmd.ICommand;

public class CmdLoop {
	private MailClient _client;
	private Hashtable<String, ICommand> _commands = new Hashtable<String, ICommand>();

	public CmdLoop(MailClient mailClient) {
		_client = mailClient;
		_commands.put("h", new client.cmd.Help());
		_commands.put("la", new client.cmd.ListAddresses());
		_commands.put("li", new client.cmd.ListInbox());
		_commands.put("lo", new client.cmd.ListOutbox());
		_commands.put("aa", new client.cmd.AddAddressBook());
		_commands.put("da", new client.cmd.DelAddressBook());
		_commands.put("cm", new client.cmd.ComposeMessage());
		_commands.put("sr", new client.cmd.SendAndRecieve());
		_commands.put("ro", new client.cmd.ReadOutbox());
		_commands.put("ri", new client.cmd.ReadInbox());
		_commands.put("do", new client.cmd.DeleteOutbox());
		_commands.put("di", new client.cmd.DeleteInbox());	
		_commands.put("sv", new client.cmd.Save());
		_commands.put("ld", new client.cmd.Load());
	}
	private boolean processCommand(String s, Scanner scanner) {
		
		 if (s.equalsIgnoreCase("q")) { // quit
			return false;
		} else if(!s.isEmpty()){
			if(_commands.get(s) != null){
				_commands.get(s).run(_client);
			}else{
				 System.out.println(s + " not understood, type h for help");
			}
		} else if (s.isEmpty()){
			// do nothing
		} else {
			System.out.println("Unrecongized Command type h for help");
		}
		return true;
	}

	public void run() {
		
		boolean active = true;
		Scanner scanner = new Scanner(System.in);
		while (active) {
			System.out.print("Mail: ");
			String input = scanner.nextLine();
			active = processCommand(input, scanner);
		}
	}

}
