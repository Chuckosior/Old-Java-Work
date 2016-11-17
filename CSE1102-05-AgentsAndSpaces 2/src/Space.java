// Project 5: Agents and Spaces2
// CSE1102 Spring 2015
// Chris Kosior
// 3/29/2015
// TA: Yusuf Albayram
// Section: 12
// Instructor: Jeffrey A. Meunier
public class Space {
	private String _name, _description, _imageName;
	private Portal _portal;	
	
	public Space(String name, String description, String imageName, Portal portal)
	{
		_name = name;
		_description=description;
		_imageName=imageName;
		_portal=portal;
	}
	/*
	 * GETTERS
	 */
	public String getImageName()
	{
		return _imageName;
	}
	public String getName()
	{
		return _name;
	}
	
	public String getDescription()
	{
		return _description;
	}
	
	public Portal getPortal()
	{
		return _portal;
	}
	
	
	/*
	 * SETTERS
	 */
	public void setName(String name)
	{
		_name = name;
	}
	
	public void setDescription(String description)
	{
		_description = description;
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
		return this._name;
	}
	
	public String toStringLong()
	{
		if (this._portal != null)
		{
			return this._name + ": "  + this._description + " with a " + this._portal.toStringLong();
		}
		else
		{
			return this._name + ": " + this._description;
		}
		
	}
}
