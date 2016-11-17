
public class Space {
	private String _name;
	private String _description;
	private Portal _portal;
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
	public String toString()
	{
		return _name;
	}
	public String toStringLong()
	{
		return _description;
	}
	public void setName(String name) 
	{
		this._name = name;
	}
	public void setDescription(String description)
	{
		this._description = description;
	}
	public void setPortal(Portal portal)
	{
		this._portal = portal;
	}
}



