
public class Agent {
	private Space _location;
	private String _name;
	public String getName()
	{
		return _name;
	}
	public Space getLocation()
	{
		return _location;
	}
	public void setName(String name)
	{
		this._name = name;
	}
	public void setLocation(Space location)
	{
		this._location = location;
	}
	public String toString()
	{
		return _name;
	}
	public String toStringLong()
	{
		return _name + "is in" + _location.toString();
	}
	public void usePortal()
	{
		Portal p1 = _location.getPortal();
		if (p1 == null)
		{
			System.out.println("You cannot travel any further north.");
		}
		else
		{
			p1.transport(this);
			System.out.println("Ye head north");
		}
	}
}

