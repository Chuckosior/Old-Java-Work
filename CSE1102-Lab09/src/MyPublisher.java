//Chris Kosior//
//Yusuf Albayram//
//CSE1102-SEC12//
//Lab-09//
//4/8/2015//
public class MyPublisher implements IPublisher
{
	private ISubscriber[] _subscribers;
	private String _publisherName;
	private int _nextEmptyLocation;
	
	public MyPublisher(String publisherName)
	{
		_publisherName = publisherName;
		_subscribers = new ISubscriber[4];
		_nextEmptyLocation = 0;
		
	}
	
	public String getName()
	{
		return _publisherName;
	}
	
	public void subscribe(ISubscriber subscriber) 
	{
		if(_subscribers[_nextEmptyLocation] == null)
		{
			_subscribers[_nextEmptyLocation] = subscriber;
			_nextEmptyLocation++;
		}
	}

	public void unsubscribe(ISubscriber subscriber) 
	{
		for(int n = _nextEmptyLocation; n < _subscribers.length; n++)
		{
			if(_subscribers[n] == subscriber)
			{
				_subscribers[n] = null;
			}
		}
	}
	
	public void publish()
	{
		Message msg = new Message(this);
		for(ISubscriber subscriber : _subscribers)
		{
			if(subscriber != null)
			{
				subscriber.notify(msg);
			}
		}
	}

}

