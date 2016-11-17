//Chris Kosior//
//Yusuf Albayram//
//CSE1102-SEC12//
//Lab-09//
//4/8/2015//
public class Message {
	
	private IPublisher _publisher;
	
	public Message(IPublisher publisher)
	{
		_publisher = publisher;
	}
	
	public IPublisher getPublisher()
	{
		return _publisher;
	}
}
