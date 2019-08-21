
public class ListThing {
	public static Node root;
	public static Node curr;

	public static void main(String[] args) {
		ListThing ll = new ListThing(10);
		ll.insert(5);
		ll.insert(15);
		ll.insert(22);
		
		System.out.println(ll.find(5).getValue());
	}

	public ListThing(int val) {
		root = new Node(val);
		curr = root;
	}

	public void insert(int data) {
		curr.setNext(new Node(data));
		curr = curr.getNext();
	}

	public Node find(int toFind) {
		curr = root;
		
		while (curr != null) {
			if (curr.getValue() == toFind) {
				return curr;
			}
			curr = curr.getNext();
		}

		return null;
	}
	
	public static void printList() {
		curr = root;
		while(curr != null) {
			System.out.println(curr.getValue());
			curr = curr.getNext();
		}
	}
}
