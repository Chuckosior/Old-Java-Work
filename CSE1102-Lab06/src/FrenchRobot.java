
public class FrenchRobot extends Robot{

	public FrenchRobot(String name) {
		super(name);
	}
public void sayName()
{
	System.out.println("Je m'appelle"+this.getName());
}
	@Override
	public void sayHello() {
		System.out.print("Bonjour. ");
		this.sayName();
	}

}
