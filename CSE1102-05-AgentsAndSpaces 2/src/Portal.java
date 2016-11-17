// Project 5: Agents and Spaces2
// CSE1102 Spring 2015
// Chris Kosior
// 3/29/2015
// TA: Yusuf Albayram
// Section: 12
// Instructor: Jeffrey A. Meunier

public class Portal {
	private String _name, _direction;
	private Space _destination;
	private Portal _portal;
	/*
	 * CONSTRUCTOR
	 */
	public Portal(String name, String direction, Space destination)
	{
		_name = name;
		_direction = direction;
		_destination = destination;
	}

	/*
	 * GETTERS
	 */
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

	/*
	 * SETTERS
	 */
	public void setName(String name)
	{
		_name = name;
	}

	public void setDirection(String direction)
	{
		_direction = direction;
	}

	public void setDestination(Space destination)
	{
		_destination = destination;
	}
public void setPortal(Portal portal)
{
	_portal = portal;
}

	/*
	 * ACCESSORIES
	 */
	public String toString()
	{
		return this._name + " that goes " + this._direction;
	}

	public String toStringLong()
	{
		return toString() + " to " + _destination.getName();
	}

	public void transport(Agent agent)
	{
		agent.setLocation(_destination);
	}
}
