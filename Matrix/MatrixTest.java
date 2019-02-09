/*
 * Class to test matrix class
 */
public class MatrixTest {

	private static Matrix first = new Matrix(2, 2);
	private static Matrix second = new Matrix(2, 2);
	
	public static void main(String[] args) throws MatrixException {
		testFunctions();
	}
	
	public static void testTranspose() throws MatrixException{
		
		
		for(int i = 0; i < first.rowVar; i++) {
			for (int j = 0; j < first.rowVar; j++) {
				first.set(i, j, (Math.random() * 49 + 1));
			}
		}
		
		Matrix done = new Matrix(2,2);
		
		done = done.transpose(first);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(first.get(i, j));
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(done.get(i, j));
			}
		}
	}
	
	public static void testFunctions() throws MatrixException{
		Matrix end = new Matrix(2,2);
		
		for(int i = 0; i < first.rowVar; i++) {
			for (int j = 0; j < first.rowVar; j++) {
				first.set(i, j, (int)(Math.random() * 49 + 1));
			}
		}
		
		for(int i = 0; i < second.rowVar; i++) {
			for (int j = 0; j < second.rowVar; j++) {
				second.set(i, j, (int)(Math.random() * 49 + 1));
			}
		} 
		System.out.println("First Matrix: \n");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(first.get(i, j));
			}
		}
		System.out.println("Second Matrix: \n");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(second.get(i, j));
			}
		}
		//Change mult to desired function
		end = end.mult(first, second);
		
		System.out.println("Completed: \n");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(end.get(i, j));
			}
		}
		
	}
}
