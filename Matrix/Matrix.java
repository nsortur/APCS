
public class Matrix {
	 
	public int rowvar;
	public int colvar;
	public double[][]mat;
	
	public Matrix(int row, int col) {
		this.rowvar = row;
		this.colvar = col;
		double[][]mat = new double[this.rowvar][this.colvar];
	}
	
	public void set(int a, int b, double c) throws MatrixException{
		if (a > rowvar || b > colvar) {
			throw new MatrixException("Error");
		} else if(a < 0 || b < 0) {
			throw new MatrixException("No negative numbers kthx");
		} else {
				mat[a][b] = c;
		}
	}
	
	public double get(int a, int b) throws MatrixException{
		if (a > rowvar || b > colvar) {
			throw new MatrixException("Error");
		} else if(a < 0 || b < 0) {
			throw new MatrixException("No negative numbers kthx");
		} else {
			return mat[a][b];
		}
	}
	
	public void add(Matrix a, Matrix b)throws MatrixException{
		if(a==null || b == null || a != b) {
			throw new MatrixException("Bad");
		} else {
			for(int c = 0; //continue)
		}
	}
}
