import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/*
 * Adds two files num1 and num2 containing integers using linked lists
 * @author Neel Sortur
 */
public class LinkedListAdd {

	public static Node head;

	public static Node curr;
	
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
		
//		listTwo = new LinkedListAdd(numTwo.nextInt());
//		addToList(listTwo, numTwo);
		
		printList(listOne);
		
		//LinkedListAdd prnt = addLists(listOne, listTwo);
		
		//printList(prnt);
		
	}
	public LinkedListAdd() {head = new Node();}
	
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
	
	public static LinkedListAdd addLists(LinkedListAdd first, LinkedListAdd second) {
		int carry = 0;
		int val;
		LinkedListAdd result = new LinkedListAdd();
		
		//sets pointers to last node in linked list
		while(first.curr.getNext() != null) {
			first.curr = first.curr.getNext();
		}
		while(second.curr.getNext() != null) {
			second.curr = second.curr.getNext();
		}
		System.out.println(first.curr.getValue());
		
//		while(first.curr != null && second.curr != null) {
//			val = first.curr.getValue() + second.curr.getValue() + carry;
//			//gets carried value
////			if(val > 9) {
////				carry = val % 10;
////				val -= 10;
////			}
////			result.curr.setValue(val);
////			
////			first.curr = first.curr.getPrev();
////			second.curr = second.curr.getPrev();
//		}
		return result;
	}
}
