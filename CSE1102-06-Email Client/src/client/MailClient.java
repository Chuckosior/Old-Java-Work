package client;

import java.util.ArrayList;

public class MailClient {
	private Contact _contact;
	AddressBook adBook = new AddressBook();
	MailBox inbox = new MailBox();
	MailBox outbox = new MailBox();

	public MailClient(Contact contact)
	{
		_contact = contact;
		adBook.addContact(contact);

	}

	public AddressBook getAddressBook()
	{
		return adBook;
	}
	public Message getMessage(Message message)
	{
		return message;
	}
	public void addToInBox(Message message)
	{
		inbox.addMessage(message);
	}
	public void addToOutBox(Message message)
	{
		outbox.addMessage(message);
	}
	public MailBox getInBox()
	{
		return inbox;
	}
	public MailBox getOutBox()
	{
		return outbox;
	}
	public Contact getMyAddress()
	{
		return _contact;
	}
	public Contact searchForContact(String nickName)
	{
		return adBook.search(nickName);
	}
	public Contact searchForAddress(String address)
	{
		return adBook.search(address);
	}
	public int outBoxSize()
	{
		return outbox.count();
	}
	public int inBoxSize()
	{
		return inbox.count();
	}
	public boolean outBoxEmpty()
	{
		return this.outBoxSize() == 0;
	}
	public boolean inBoxEmpty()
	{
		return this.inBoxSize() == 0;
	}
}


