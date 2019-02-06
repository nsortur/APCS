import java.util.*;
import java.io.*;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		}
		// Actually an object for Arithmetic Exception, which is e
		catch (ArithmeticException e) {
			// Does the code in the catch instead of just ending
			// This prints out the exception object, e
			System.out.println("Oh no: " + e.getMessage());
		}
		/**
		 * Lets say program is expecting the file to have a bunch of integers But the
		 * file has a string You can catch InputMismatchException, and inside the catch
		 * put scan.next(); It will skip the string that had a mismatch
		 */
		try {
			Scanner scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
			ArrayList<Integer> blarg = new ArrayList<Integer>();

			while (scan.hasNext()) {
				blarg.add(scan.nextInt());
			}
			System.out.println("What element number do u want: ");
			try {

				Scanner input = new Scanner(System.in);
				int inputty = input.nextInt();
				System.out.println(blarg.get(inputty));
				
			} catch (Exception a) {
				System.out.println("Follow instructions plz: " + a.getMessage());
			}

		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND AHH: " + e.getMessage());
		}
		
		CustomClass a = new CustomClass();
		a.x = 5;
		try {
			a.someMethod();
		} catch (CustomException f) {
			System.out.println("This aint it chief: " + f.getMessage());
		}
		
	}
}