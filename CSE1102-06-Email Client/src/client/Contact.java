package client;

public class Contact {
	private String _address;
	private String _fullName;
	private String _nickName;

	public Contact(String address, String fullName, String nickName)
	{
		_address = address;
		_fullName = fullName ;
		_nickName = nickName;
	}
	public Contact(String address)
	{
		_address = address;
	}

	@Override
	public String toString() 
	{
		return _fullName + " (" + _nickName + ") <" + _address + ">";
	}
	public String getNickName()
	{
		return _nickName;
	}
	public String getAddress()
	{
		return _address;
	}
}
