package client;

import java.util.ArrayList;

public class AddressBook {


	private ArrayList<Contact> cList = new ArrayList<Contact>();

	//Add method
	public void addContact(Contact contact)
	{
		cList.add(contact);
	}

	public void removeContact(String nickName)
	{
		Contact removeThis = search(nickName);
		if(removeThis != null)
		{
			cList.remove(removeThis);
		}
	}
	public Contact search(String nickName)
	{
		for(Contact contact : cList)
		{
			if(nickName.equals(contact.getNickName()))
			{
				return contact;
			}
			if(nickName.equals(contact.getAddress()))
			{
				return contact;
			}
		}
		return null;

	}

	public void showContacts()
	{
		for( int n=0 ; n < cList.size(); n++)
		{
			System.out.println(n+1+": "+cList.get(n));
		}
	}
}

