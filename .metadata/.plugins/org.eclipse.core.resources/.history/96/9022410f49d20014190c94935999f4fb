
public class Portal {
	private String _name;
	private String _direction;
	private Space _destination;

	public String getName()
	{
		return _name;
	}
	public String getDirection()
	{
		return _direction;
	}
	public Space getDestination()
	{
		return _destination;
	}
	public String toString()
	{
		return _name + "that goes" + _direction;
	}
	public String toStringLong()
	{
		return _name + "to" + _direction;
	}
	public void setName(String name)
	{
		this._name = name;
	}
	public void setDirection(String direction)
	{
		this._direction = direction;
	}
	public void setDestination(Space destination)
	{
		this._destination = destination;
	}
	public void transport(Agent agent)
	{
		agent.setLocation(_destination);
	}

}

