// Public class representing a parameterized Node
public class Node<T> {

	// Private data (Type: T)
	private T data;
	// Next pointer (Node<T>) for linked structure
	private Node<T> next = null;

	// Constructor to build Node<T> with no next
	public Node(T data) {
		this.data = data;
	}

	// Constructor to build Node<T> given next pointer
	public Node(T data, Node<T> next) {
		this(data);
		this.next = next;
	}

	// Accessor to get data
	public T getData() {
		return data;
	}

	// Accessor to get next node
	public Node<T> getNext() {
		return next;
	}

	// Setter to set next node
	public void setNext(Node<T> next) {
		this.next = next;
	}

	// Public toString method to print out the Node<T> in simple form
	public String toString() {
		return "" + data;
	}

}
