
public class Robot
{

	private String _name;
	private int _serialNumber;
	private Battery _powerSource;
	private Gripper _gripper;
	private static int _nextSerialNumber;

	public Robot() 
	{
		_name = "";
		_serialNumber = nextSerialNumber();
		_powerSource = new Battery();
		_gripper = new Gripper();
		_powerSource.recharge();
	}
	public Robot(String name, int batteryMinutes) 
	{
		_name = name;
		_serialNumber = nextSerialNumber();
		_powerSource = new Battery(batteryMinutes);
		
	}
	public int getMinutes()
	{
		return _powerSource.getMinutes();
	}
	public int nextSerialNumber()
	{
		return _nextSerialNumber++;
	}
	
	public int getSerialNumber()
	{
		return _serialNumber;
	}
}

