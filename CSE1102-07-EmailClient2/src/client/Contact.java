package client;

import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

//HW 06: Email Client
//CSE1102 Project 06, Spring 2015
//Your name goes here
//The current date goes here
//TA: Your TA's name goes here
//Section: Your section number goes here
//Instructor: Jeffrey A. Meunier

public class Contact {

	private String _email, _nick, _fullname;

	public Contact(String email, String fullnm, String nick) {
		_email = email;
		_nick = nick;
		_fullname = fullnm;
	}

	public Contact(String email) {
		this(email, "", "");
	}

	@Override
	public String toString() {
		if (_fullname.isEmpty() && _nick.isEmpty())
			return "<" + _email + ">";
		if (_nick.isEmpty())
			return _fullname + " <" + _email + ">";
		if (_fullname.isEmpty())
			return _nick + " <" + _email + ">";
		return _fullname + " (" + _nick + ") <" + _email + ">";
	}

	public String getEmailAddress() {
		return _email;
	}

	public String getNick() {
		return _nick;
	}

	public String getFullName() {
		return _fullname;
	}
	public void save(PrintStream ps, AddressBook ab)
	{
		if(ab.search(_nick) != null)
		{
			ps.println(_nick);
		}
		else 
		{
			ps.println(_email);
		}
	}
	public void saveFull(PrintStream ps, AddressBook ab)
	{
		ps.println(_email);
		ps.println(_fullname);
		ps.println(_nick);
	}
	public static Contact loadFull(Scanner scan) {
		String email = scan.nextLine();
		String fName = scan.nextLine();
		String nName = scan.nextLine();

		return new Contact(email, fName, nName);
	}
	public static Contact load(Scanner scan, AddressBook ab) {
		try {	
			String temp = scan.nextLine();
			if(temp != null) {
				if(temp.contains("@"))
					return new Contact(temp);
				return ab.search(temp);

			}
			return null;
		}catch(NoSuchElementException e)
		{
			return null;
		}
	}
}
