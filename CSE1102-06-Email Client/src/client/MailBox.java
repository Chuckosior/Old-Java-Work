package client;

import java.util.ArrayList;

public class MailBox
{
	private ArrayList<Message> messages = new ArrayList<Message>();
	public void addMessage(Message message)
	{
		messages.add(message);
	}
	public int count()
	{
		int counter = messages.size();
		return counter;
	}

	public Message getMessage(int n)
	{
		return messages.get(n);
	}
	public int removeMessage(int n)
	{
		messages.remove(n);
		return n;
	}
	public void show()
	{
		for( int n=0 ; n < messages.size(); n++)
		{
			System.out.println(n+1+": "+messages.get(n));
		}
	}
}