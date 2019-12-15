public class Node {
	Node prev;
	Node next;
	int value;

	public <U> Node(Node prev, Node next, U value2) {
		super();
		this.prev = prev;
		this.next = next;
		this.value = (int) value2;
	}
}
