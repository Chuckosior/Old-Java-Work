//Chris Kosior//
//Yusuf Albayram//
//CSE1102-SEC12//
//Lab-09//
//4/8/2015//
public class MySubscriber implements ISubscriber{
	
	private String _subscriberName;

	public MySubscriber(String subscriberName)
	{
		_subscriberName = subscriberName;
	}
	public void notify(Message msg) 
	{
		System.out.println("notify called on " + _subscriberName);
		IPublisher pub = msg.getPublisher();
		if(pub instanceof MyPublisher)
		{
			MyPublisher myPub = (MyPublisher)pub;
			String pubName = myPub.getName();
			System.out.println(" by the publisher " + pubName);
		}
	}

}
