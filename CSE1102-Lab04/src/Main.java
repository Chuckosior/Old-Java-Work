
public class Main 
{
	public static void main(String[] args)
	{
		Robot r1 = new Robot();
		Robot r2 = new Robot("stupid", 25);
		Robot r3 = new Robot("idiot", 65);
		Robot r4 = new Robot("dummy", 95);
		System.out.println(r1.getMinutes());
		System.out.println(r2.getMinutes());
		System.out.println(r3.getMinutes());
		System.out.println(r4.getMinutes());
		System.out.println(r1.getSerialNumber());
		System.out.println(r2.getSerialNumber());
		System.out.println(r3.getSerialNumber());
		System.out.println(r4.getSerialNumber());
	}
}