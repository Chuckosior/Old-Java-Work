
public class Main {

	public static void main(String[] args) {
		Node n1 = new Node("x", 100, null);
		Node n2 = new Node("y", 200, n1);
		Node n3 = new Node("z", 300, n2);
		System.out.println(n3);
	}

}
