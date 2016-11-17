

public class SortedList<T extends Comparable> {

	// Private head of list (starts out null)
	private Node<T> head = null;
	// Private count of items
	private int length = 0;

	// Constructor to create Linked List
	public SortedList() {
	}

	// Method to return boolean (true if list is empty)
	public boolean isEmpty() {
		return (head == null);
	}

	// Get the number of items in the list
	public int size() {
		return (length);
	}

	// Clear the list of all items
	public void clear() {
		head = null;
		length = 0;
	}

	// Method to get an item at a position in the list

	//
	public T get(int pos) {
		if (length < pos || pos <= 0)
			return null;
		else {
			Node<T> p = head;
			for (int i = 1; i < pos; i++)
				p = p.getNext();
			return p.getData();
		}
	}

	//
	// // Method to get a node containing an item
	// public Node<T> get2(T data) {
	// Node<T> ret = null;
	// Node<T> p = head;
	// while (p != null && !p.getData().equals(data))
	// p = p.getNext();
	// if (p != null)
	// ret = p;
	// return ret;
	// }

	/*
	 * Methods of ADT List to implement
	 * 
	 * +Create +isEmpty +Size +Get +Clear Add Remove
	 * 
	 * Other ideas:
	 * 
	 * Contains toString
	 */

	// public boolean add(T item, int pos) {
	// Node<T> p = head;
	// if (pos > (length + 1)) {
	// return false;
	// } else if (pos == 1 || head == null) {
	// head = new Node<T>(item, head);
	// length++;
	// } else {
	// for (int i = 0; i < (pos - 2); i++)
	// p = p.getNext();
	// p.setNext(new Node<T>(item, p.getNext()));
	// length++;
	// }
	// return true;
	// }

	public boolean add(T item) {
		Node<T> p = head;
		boolean b = false;
		//if list is empty or smallest.
		if(head == null || item.compareTo(head.getData())<0) {
			head = new Node<T>(item, head);
			length++;
			b = true;
		}
		else {
			while(p.getNext() != null && item.compareTo(p.getNext().getData())<=0)
				p=p.getNext();
	
		p.setNext( new Node<T>(item, p.getNext()));
		b=true;
		length++;
		}
		return b;
	}

	public boolean remove(T item) {
		boolean b = false;
		if (head == null) {
			return false;
		} else if (head.getData() == item) {
			head = head.getNext();
			length--;
			b = true;
		} else {
			Node<T> p = head;
			while (p.getNext() != null && p.getNext().getData() != item)
				p = p.getNext();
			if (p.getNext() != null) {
				p.setNext(p.getNext().getNext());
				length--;
				b = true;
			}
		}
		return b;
	}

	// Return true if the item was added to the list successfully


	// Get the item at a particular index (null if the index wasn't legal)
	// public Integer get(int index) {
	// return null;
	// }

	// Return the index where an item is found (-1 if the item wasn't in the
	// list)
	public int find(T item) {
		Node<T> p = head;
		int foundit = -1;
/*		if(size() == 0){
			System.out.println("The list is empty, stupid.");
		}
		
		else */if(p != null && item != p.getData()) {
			p = p.getNext();
		}
		
		return foundit;
	}

	public String toString() {
		String s = "[";

		for (Node<T> p = head; p != null; p = p.getNext()) {
			s = s + p;
			if (p.getNext() != null)
				s = s + ", ";
		}

		return s + "]";
	}

	public boolean contains(T item) {
		boolean foundIt = false;
		if (size() == 0) {
			return false;
		}
		Node<T> current = head.getNext();
		for (int i = 0; i < length; i++) {
			if (current.equals(item)) {
				foundIt = true;
			}
			current = current.getNext();
		}
		return foundIt;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Make a list");
		SortedList lst = new SortedList();
		System.out.println("Print the list");
		System.out.println(lst);
		System.out.println("Check the size of the list");
		System.out.println(lst.size());
		System.out.println(lst.isEmpty());
		System.out.println("Add some items to the list");
		for (int i = 1; i < 100; i += i)
			lst.add(i);
		System.out.println("Check the size of the list again");
		System.out.println(lst.size());
		System.out.println(lst.isEmpty());
		System.out.println("Print the list");
		System.out.println(lst);
		System.out.println("Print the item at positon 4");
		System.out.println(lst.get(4));
		System.out.println("Look for an item that is there");
		System.out.println(lst.find(32));
		System.out.println("Look for an item that is not there");
		System.out.println(lst.find(42));
		System.out.println("Add a couple more items");
		lst.add(99);
		lst.add(-1);
		System.out
				.println("Try to remove something that is not there (and check the size)");
		System.out.println(lst.remove(3));
		System.out.println(lst.size());
		System.out.println(lst);
		System.out
				.println("Try to remove something that is there (and check the size)");
		System.out.println(lst.remove(4));
		System.out.println(lst.size());
		System.out.println(lst);
	}
}
