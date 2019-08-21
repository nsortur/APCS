
public class Node {
	
	int value;
	Node next;
	Node prev;
	
	public Node() {}
	
	public Node(int val) {
		this.value = val;
	}
	
	public Node(int val, Node next) {
		this.value = val;
		this.next = next;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int val) {
		this.value = val;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public int getNextValue() {
		return next.getValue();
	}
	
	public void setNextValue(int val) {
		next.setValue(val);
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setPrev(Node previous) {
		prev = previous;
	}
}
