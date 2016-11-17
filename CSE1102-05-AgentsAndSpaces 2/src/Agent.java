
// Project 5: Agents and Spaces2
// CSE1102 Spring 2015
// Chris Kosior
// 3/29/2015
// TA: Yusuf Albayram
// Section: 12
// Instructor: Jeffrey A. Meunier

import jeff.textconsole.TextConsole;

public class Agent {
	private Space _location;
	private String _name;
	
	/*
	 * CONSTRUCTOR
	 */
	public Agent(String name, Space location)
	{
		_name = name;
		_location = location;
	}
	/*
	 * SETTERS
	 */
	public String getName() {
		return _name;
	}
	public Space getLocation() {
		return this._location;
	}
	/*
	 * SETTERS
	 */
	public void setName(String _name) {
		this._name = _name;
	}
	public void setLocation(Space _location) {
		this._location = _location;
	}
	
	
	/*
	 * ACCESSORIES
	 */
	public String toString()
	{
		return this._name;
	}
	
	public String toStringLong()
	{
		
		return this.toString() + " is in " + this._location.getName();
	}

	public void usePortal(TextConsole textConsole)
	{
		
		if (this._location.getPortal() != null)
		{
			textConsole.println(this._name
					+ " is moving from "
					+ this._location
					+ " to "
					+ this._location.getPortal().getDestination().getName());

			this._location.getPortal().transport(this);
		}
			
	}
}