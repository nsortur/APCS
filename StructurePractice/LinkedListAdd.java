import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LinkedListAdd {

	public static Node head;

	public static Node curr;
	private int val;

	public static void main(String[] args) {
		Scanner numOne = null;
		Scanner numTwo = null;
		try {
			numOne = new Scanner(new BufferedReader(new FileReader("num1.txt")));
			numTwo = new Scanner(new BufferedReader(new FileReader("num2.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		LinkedListAdd listOne = new LinkedListAdd(numOne.nextInt());
		addToList(listOne, numOne);
		
		LinkedListAdd listTwo = new LinkedListAdd(numTwo.nextInt());
		addToList(listTwo, numTwo);
		
		
	}

	public LinkedListAdd(int value) {
		head = new Node(value);
		curr = head;
	}

	public void insert(int a) {
		curr.setNext(new Node(a));
		curr = curr.getNext();
	}

	public static void addToList(LinkedListAdd list, Scanner scan) {
		while (scan.hasNext()) {
			list.insert(scan.nextInt());
		}
	}
	
	public static void printList(LinkedListAdd list) {
		list.curr = list.head;

		while (list.curr != null) {
			System.out.println(list.curr.getValue());
			list.curr = list.curr.getNext();
		}
	}
}
