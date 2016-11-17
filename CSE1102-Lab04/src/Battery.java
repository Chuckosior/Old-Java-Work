
public class Battery
{	
	private int _minutesLeft;

	public void recharge() 
	{
		_minutesLeft = 30;
	}

	public Battery(int minutesLeft) 
	{
		_minutesLeft = minutesLeft;
	}

	public Battery()
	{
		this.recharge();
	}
	public int getMinutes()
	{
		return _minutesLeft;
	}
}