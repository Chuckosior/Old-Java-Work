package client;

//HW 06: Email Client
//CSE1102 Project 06, Spring 2015
//Your name goes here
//The current date goes here
//TA: Your TA's name goes here
//Section: Your section number goes here
//Instructor: Jeffrey A. Meunier

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Message {

	private Contact _contactTo, _contactFrom;
	private String _message, _subject;
	private Date _date;

	public Message(Contact from, Contact to, String sub, String msg) {
		_contactTo = to;
		_contactFrom = from;
		_message = msg;
		_subject = sub;
		_date = new Date();
	}

	public String getFormatedDate() {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return fmt.format(_date);
	}

	public void show() {
		System.out.println("Date: " + getFormatedDate());
		System.out.println("From: " + _contactFrom);
		System.out.println("To: " + _contactTo);
		System.out.println("Subj: " + _subject);
		System.out.println(_message);
	}

	@Override
	public String toString() {
		String s = "";
		s += "FROM: " + _contactFrom;
		s += ", TO: " + _contactTo;
		s += ", SUBJ: " + _subject;
		s += ", DATE: " + getFormatedDate();
		return s;
	}
	public void save(PrintStream ps, AddressBook ab) {
	_contactTo.save(ps,ab);
	_contactFrom.save(ps, ab);
	ps.println(_message);
	ps.println(_subject);
	ps.println(_date);
	}
	public static Message load(Scanner sc, AddressBook ab) {
		Contact contactTo = Contact.load(sc, ab);
		Contact contactFrom= Contact.load(sc, ab);
		String subject = sc.nextLine();
		String body = sc.nextLine();
		String time = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = null;
		try {
		 date = sdf.parse(time);
		}
		catch(ParseException e)
		{}
		
		Message loadedMessage = new Message(contactTo, contactFrom, subject, time);
		return loadedMessage;
	}
}

