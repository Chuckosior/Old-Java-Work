
public class Main {

	public static void main(String[] args) {
		Robot r1 = new EnglishRobot(" Chappie");
		Robot r2 = new FrenchRobot(" Charlie");
		Robot r3 = new GermanRobot(" Adolf");
		r1.sayHello();
		r2.sayHello();
		r3.sayHello();
	}

}
