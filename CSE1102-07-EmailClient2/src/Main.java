//HW 06: Email Client
//CSE1102 Project 06, Spring 2015
//Your name goes here
//The current date goes here
//TA: Your TA's name goes here
//Section: Your section number goes here
//Instructor: Jeffrey A. Meunier

import client.CmdLoop;
import client.Contact;
import client.MailClient;

public class Main {

	public static void main(String[] args) {
		Contact contact = new Contact("christopher.kosior@uconn.edu",
				"Christopher Kosior", "Chris");
		MailClient mailClient = new MailClient(contact);
		CmdLoop cmdLoop = new CmdLoop(mailClient);
		cmdLoop.run();
	}

}
