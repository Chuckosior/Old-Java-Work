package client;

import java.util.Scanner;

public class CmdLoop {

	private MailClient _mailClient;

	public CmdLoop(MailClient mailclient)
	{
		_mailClient = mailclient;
	}

	public void run()
	{
		boolean loopControl = true;
		Scanner kbd = new Scanner(System.in);
		String input;
		//system outs
		do
		{
			System.out.print("Mail: ");
			String opt = kbd.nextLine();
			if(opt.equals("q"))
			{
				System.out.println("quitting...");
				loopControl = false;
			}
			else if(opt.equals(""))
			{
				System.out.println("");
			}
			else if(opt.equals("h"))
			{
				//help
				System.out.println("List of possible commands: ");
				System.out.println("la: list address book");
				System.out.println("li: list inbox");
				System.out.println("lo: list outbox");
				System.out.println("aa: add to address book");
				System.out.println("da: delete from address book");
				System.out.println("cm: compose message");
				System.out.println("ro: read outbox message");
				System.out.println("do: delete outbox message");
				System.out.println("sr: send and recieve");
				System.out.println("ri: read inbox message");
				System.out.println("di: delete inbox message");	
			}
			else if(opt.equals("la"))
			{
				_mailClient.getAddressBook().showContacts();
			}
			else if(opt.equals("li"))
			{
				int size = _mailClient.inBoxSize();
				if (size == 0)
					System.out.println("the inbox is empty");
				else
				_mailClient.inbox.show();
				//list inbox
			}
			else if(opt.equals("lo"))
			{
				int size = _mailClient.outBoxSize();
				if(size == 0)
					System.out.println("the outbox is empty");
				else
				_mailClient.outbox.show();
				//list outbox
			}
			else if(opt.equals("aa"))
			{
				System.out.println("Please enter information");
				System.out.println("Email Address: ");
				String fullName = kbd.nextLine();
				System.out.println("Full Name: ");
				String nickName = kbd.nextLine();
				System.out.println("NickName: ");
				String emailAddress = kbd.nextLine();
				_mailClient.getAddressBook().addContact(new Contact(fullName,nickName,emailAddress));
			
			}
			else if(opt.equals("da"))
			{
				System.out.println("Enter nickname of contact you want to erase");
				String nickName = kbd.nextLine();
				System.out.println(nickName+ " has been erased");
				_mailClient.getAddressBook().removeContact(nickName);	
			
			}
			else if(opt.equals("cm"))
			{
				System.out.print("Enter nickname or address");
				String nameOrAddress = kbd.nextLine();
				System.out.print("Subject: ");
				String subject = kbd.nextLine();
				System.out.print("Body: ");
				String body = kbd.nextLine();
				_mailClient.addToOutBox(new Message (_mailClient.getMyAddress(),
						_mailClient.searchForContact(nameOrAddress), subject, body));

			}
			else if(opt.equals("ro"))
			{
				System.out.println("Enter message number");
				int n = kbd.nextInt();
				int size = _mailClient.outBoxSize();
				if (n >= 0 && n <= size)
				{
					if(size==0)
					{
						System.out.println("Outbox is Empty");
					}
					else if(size==1)
					{
						_mailClient.getOutBox().getMessage(0).show();
					}
					else if (size > 1)
					{
						_mailClient.getOutBox().getMessage(n-1).show();
					}
				}
				else
					System.out.println("Invalid message number");

			}
			else if(opt.equals("do"))
			{
				System.out.println("Enter message number");
				int n = kbd.nextInt();
				int size = _mailClient.outBoxSize();
				if (n >= 0 && n < size)
				{
					if(size==0)
					{
						System.out.println("Outbox is Empty");
					}
					else if(size==1)
					{
						_mailClient.getOutBox().removeMessage(0);
					}
					else if (size > 1)
					{
						_mailClient.getOutBox().removeMessage(n-1);
					}
				}
				else
					System.out.println("Invalid message number");

			}
			else if(opt.equals("sr"))
			{
				//send and receive
				for(int n = 0; n < _mailClient.outBoxSize(); n++)
				{
					_mailClient.getInBox().addMessage(_mailClient.getOutBox().getMessage(0));
					_mailClient.getOutBox().removeMessage(0);
				}
			}
			else if(opt.equals("ri"))
			{
				System.out.println("Enter message number");
				int n = kbd.nextInt();
				int size = _mailClient.inBoxSize();
				if(n >= 0 && n <= size)
				{
					if(size==0)
					{
						System.out.println("Inbox is Empty");
					}
					else if(size==1)
					{
						_mailClient.getInBox().getMessage(0).show();
					}
					else if (size > 1)
					{
						_mailClient.getInBox().getMessage(n-1).show();
					}
				}
				else
					System.out.println("Invalid message number");
			}

			else if(opt.equals("di"))
			{
				System.out.println("Enter message number");
				int n = kbd.nextInt();
				int size = _mailClient.outBoxSize();
				if (n >= 0 && n <= size)
				{
					if(size==0)
					{
						System.out.println("Inbox is Empty");
					}
					else if(size==1)
					{
						_mailClient.getInBox().removeMessage(0);
					}
					else if (size > 1)
					{
						_mailClient.getInBox().removeMessage(n-1);
					}
				}
				else
					System.out.println("Invalid message number");
			}
			else
			{
				System.out.println(opt+" not an option, type h for help");
			}
		}while(loopControl == true);
	}
}

