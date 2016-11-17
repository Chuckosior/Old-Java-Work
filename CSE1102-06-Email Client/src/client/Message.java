package client;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Message {

	private Contact _to;
	private Contact _from;
	private String _body;
	private String _subject;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	public Message(Contact to, Contact from, String subject, String body)
	{
		_to = to;
		_from = from;
		_body = body;
		_subject = subject;

	}
	public void show()
	{
		System.out.println(dateFormat.format(date));
		System.out.println("From: " + _from);
		System.out.println("Sbj: " + _subject);
		System.out.println(_body);
	}
	@Override
	public String toString()
	{
		String format = ("FROM: "+_from.toString()+ ",  TO: "+_to.toString());
		return format + ",  SUBJ: " + _subject + ",  DATE: " + dateFormat.format(date);
	}
}
