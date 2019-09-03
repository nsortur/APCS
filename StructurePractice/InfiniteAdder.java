import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Deprecated: See LinkedListAdd.java
 * @author Neel Sortur
 */
public class InfiniteAdder {
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
		LinkedListAdd.addToList(listOne, numOne);

		listTwo = new LinkedListAdd(numTwo.nextInt());
		LinkedListAdd.addToList(listTwo, numTwo);

		LinkedListAdd.printList(listOne);

//		LinkedListAdd prnt = addLists(listOne, listTwo);
//		printList(prnt);
	}
}
