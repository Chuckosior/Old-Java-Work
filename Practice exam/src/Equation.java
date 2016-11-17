public class Equation
{

	public static void main(String[] args) 
	{
	int x = 0;
	boolean keepGoing = true;
	while(keepGoing) 
	{
		if(x > 6)
			keepGoing = false;
		x = x + 1;
	}
	System.out.println(x);
}

}


