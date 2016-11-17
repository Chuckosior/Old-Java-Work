
public class Node {
	public Object _key;
	public Object _value;
	public Node _next;

	public Node(Object key, Object i, Node next) {
		_key = key;
		_value = i;
		_next = next;
	}

	public String toString()
	{
		String s = _key.toString() + "=" + _value.toString();
		if(_next != null)
			s += ", " + _next.toString();
		return s;
	}
}
