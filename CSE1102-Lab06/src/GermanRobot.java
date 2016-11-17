
public class GermanRobot extends Robot{

	public GermanRobot(String name) {
		super(name);
	}
public void sayName() {
	System.out.println("Ich heiﬂe"+this.getName());
}
	@Override
	public void sayHello() {
		System.out.print("Guten Tag. ");
		this.sayName();
	}

}
