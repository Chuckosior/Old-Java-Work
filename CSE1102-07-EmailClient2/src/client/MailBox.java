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

public class MailBox {

	private ArrayList<Message> _messages = new ArrayList<Message>();

	public void add(Message msg) {
		_messages.add(msg);
	}

	public int count() {
		return _messages.size();
	}

	public Message getMessage(int i) {
		if (i < 0 || i >= count()) {
			return null;
		}
		return _messages.get(i);
	}

	public Message remove(int i) {
		Message msg = getMessage(i);
		if (msg == null)
			return null;
		_messages.remove(i);
		return msg;
	}

	public void show() {
		int index = 1;
		for (Message m : _messages) {
			System.out.println(index + ". " + m);
			index++;
		}
	}
	public void save(String filename, AddressBook ab){
		File file = new File(filename);
		try {
			PrintStream ps = new PrintStream(file);
			for(Message m : _messages) {
				m.save(ps, ab);
			}
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void load(String file, AddressBook ab)
	{
		ArrayList<Message> messageList = new ArrayList<Message>();
		File data = new File(file);
		Scanner sc = new Scanner(file);
		while(true)
		{
			Message test = Message.load(sc, ab);
			if(test == null)
			{
				break;
			}
			messageList.add(test);
		}
		_messages = messageList;
	}


}
