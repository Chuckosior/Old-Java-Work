package client;

//HW 06: Email Client
//CSE1102 Project 06, Spring 2015
//Your name goes here
//The current date goes here
//TA: Your TA's name goes here
//Section: Your section number goes here
//Instructor: Jeffrey A. Meunier

public class MailClient {

	private Contact _identity;
	private AddressBook _addrbook;
	private MailBox _inbox, _outbox;

	public MailClient(Contact me) {
		_identity = me;
		_addrbook = new AddressBook();
		_inbox = new MailBox();
		_outbox = new MailBox();

		_addrbook.add(_identity);
	}

	public void addToInbox(Message msg) {
		_inbox.add(msg);
	}

	public void addToOutbox(Message msg) {
		_outbox.add(msg);
	}

	public MailBox getInbox() {
		return _inbox;
	}

	public MailBox getOutbox() {
		return _outbox;
	}

	public Contact getMyAddress() {
		return _identity;
	}

	public Contact searchForContact(String nm) {
		return _addrbook.search(nm);
	}

	public AddressBook getAddressBook() {
		return _addrbook;
	}

}
