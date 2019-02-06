
public class Matrix {
	
	public double[][]mat;
	
	public Matrix(int a, int b) {
		mat = new double[a][b];
	}
	
	public void set(int a, int b, double c) {
		try {
			mat[a][b] = c;

		} catch (MatrixException e){
			
		}
	}
}
