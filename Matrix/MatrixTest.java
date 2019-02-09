
public class MatrixTest {


	public static void main(String[] args) throws MatrixException {
		Matrix first = new Matrix(4, 4);
		Matrix second = new Matrix(4,4);
		first.set(1, 1, 2.2);
		second.set(1, 1, 2.0);
		System.out.println(first.get(1, 1));
		System.out.println(second.get(1, 1));
		
		Matrix done = new Matrix(4,4);
		
		done.add(first, second);
		System.out.println(done.get(1,1));
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(done.get(i, j));
			}
		}
	}
}
