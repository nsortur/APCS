import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Class for implementing linked lists
 * Adds two files of integers using linked lists
 * 
 * @author Neel Sortur
 */
public class LinkedListAdd {

	public Node head;

	public Node curr;
	public Node prev;

	public static LinkedListAdd listOne;
	public static LinkedListAdd listTwo;

	public static void main(String[] args) {
		Scanner numOne = null;
		Scanner numTwo = null;
		try {
			numOne = new Scanner(new BufferedReader(new FileReader("num1.txt")));
			numTwo = new Scanner(new BufferedReader(new FileReader("num2.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		listOne = new LinkedListAdd(numOne.nextInt());
		addToList(listOne, numOne);

		listTwo = new LinkedListAdd(numTwo.nextInt());
		addToList(listTwo, numTwo);

		System.out.print("First list: ");
		printList(listOne);

		System.out.print("Second list: ");
		printList(listTwo);

		LinkedListAdd prnt = addLists(listOne, listTwo);

		System.out.print("Result: ");
		printList(prnt);

	}

	public LinkedListAdd() {
		head = new Node();
	}

	public LinkedListAdd(int value) {
		head = new Node(value);
	}

	public void insert(int a) {

		curr.setNext(new Node(a));
		curr = curr.getNext();
		curr.setPrev(prev);
		prev = curr;
	}

	public void insertPrevious(int a) {
		curr.setValue(a);
		curr.setNext(head);
		curr.setPrev(null);
		if (head != null) {
			head.setPrev(curr);
		}
		head = curr;
	}

	public static void addToList(LinkedListAdd list, Scanner scan) {
		list.curr = list.head;
		while (scan.hasNext()) {
			list.insert(scan.nextInt());
		}
		
	}

	public static void printList(LinkedListAdd list) {
		list.curr = list.head;

		while (list.curr != null) {
			System.out.print(list.curr.getValue());
			list.curr = list.curr.getNext();
		}
		System.out.println("");
		list.curr = list.head;
	}

	public static LinkedListAdd addLists(LinkedListAdd first, LinkedListAdd second) {
		int carry = 0;
		int val;
		LinkedListAdd result = new LinkedListAdd();
		
		// sets pointers to last node in linked list
		while (first.curr.getNext() != null) {
			first.curr = first.curr.getNext();
		}
		while (second.curr.getNext() != null) {
			second.curr = second.curr.getNext();
		}
		//set curr pointer to head in result
		result.curr = result.head;

		while (first.curr != null && second.curr != null) {
			val = first.curr.getValue() + second.curr.getValue() + carry;
			// gets carried value
			if (val > 9) {
				carry = 1;
				val -= 10;
			}
			if (first.curr.getNext() == null) {
				result.curr.setValue(val);
			} else {
				result.insert(val);
				carry = 0;
			}
			
			first.curr = first.curr.getPrev();
			second.curr = second.curr.getPrev();
		}
		
		return result;
	}
}
