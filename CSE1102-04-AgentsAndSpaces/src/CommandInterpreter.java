import java.util.Scanner;
public class CommandInterpreter {
	public static void run(Agent agent)
	{
		boolean loopControl = true;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Ye find thineself in yon dungeon. A gate lies to the north.");
		System.out.println("What doth Ye do?");
		do
		{	
			System.out.print("==>");
			String cmd = scan.next();	
		 if(cmd.equals("help"))
		 {
				System.out.println("Only god can help thee now... But you CAN type quit, where, look, and go...");
		 }
		 else if(cmd.equals("quit"))
			{
				System.out.println("Ye fucking kill thyself... Game Over");
				loopControl = false;
			}
			else if(cmd.equals("where"))
			{
				System.out.println("Ye be " + agent.getLocation().toString());
			}
			else if(cmd.equals("look"))
			{
				System.out.println("Ye look " + agent.getLocation().toStringLong());
			}
			else if(cmd.equals("go"))
			{
				agent.usePortal();
			}
			else
			{
				System.out.println("Now what doth ye do?");
			}
		}
		while(loopControl == true); 
	}

}




