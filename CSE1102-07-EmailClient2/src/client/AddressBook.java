package client;

//HW 06: Email Client
//CSE1102 Project 06, Spring 2015
//Your name goes here
//The current date goes here
//TA: Your TA's name goes here
//Section: Your section number goes here
//Instructor: Jeffrey A. Meunier


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	private ArrayList<Contact> _contactlist = new ArrayList<Contact>();

	public void add(Contact contact) {
		_contactlist.add(contact);
	}

	public Contact search(String nm) {
		for (Contact c : _contactlist) {
			if (c.getNick().equalsIgnoreCase(nm))
				return c;
		}
		return null;
	}

	public Contact remove(String nm) {
		Contact c = search(nm);
		if (c != null) {
			_contactlist.remove(c);
		}
		return c;
	}

	public void show() {
		int index = 1;
		for (Contact c : _contactlist) {
			System.out.println(index + ". " + c);
			index++;
		}
	}
	public void save(String filename){
		File file = new File(filename);
		PrintStream stream = null;
		try {
			stream = new PrintStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Contact con = null;
		for(int i=0; i<_contactlist.size(); i++){
			con = _contactlist.get(i);
			con.saveFull(stream, this);
		}
	}
	public void load(String file)
	{
		ArrayList<Contact> contactList2 = new ArrayList<Contact>();
		File data = new File(file);
		Scanner sc = new Scanner(file);
		while(true)
		{
			Contact test = Contact.loadFull(sc);
			if(test == null)
			{
				break;
			}
			contactList2.add(test);
		}
		_contactlist = contactList2;
	}

}

