/*
 * Matrix class that can perform the following operations:
 * set, get, add, subtract, multiply(2 matrices), multiply(scalar), transpose
 * 
 * @author Neel Sortur
 */
public class Matrix {

	public int rowVar;
	public int colVar;
	private double[][] mat;
	boolean plzwork = true;

	// [rows][columns]
	/*
	 * Constructs a matrix object
	 * 
	 * @param row: the number of rows in the matrix
	 * @param col: the number of columns in the matrix
	 */
	public Matrix(int row, int col) {
		rowVar = row;
		colVar = col;
		mat = new double[rowVar][colVar];
	}
	/*
	 * Sets the value for a specified cell in the matrix
	 * 
	 * @param a: row dimension to set value
	 * @param b: column dimension to set value
	 * @param c: desired value for the cell
	 */
	public void set(int a, int b, double c) throws MatrixException {
		if (a > rowVar || b > colVar) {
			throw new MatrixException("Values not in matrix bounds");
		} else if (a < 0 || b < 0) {
			throw new MatrixException("No negative numbers kthx");
		} else {
			mat[a][b] = c;
		}
	}
	/*
	 * Gets a specified call in the matrix
	 * 
	 * @param a: row dimension to get value
	 * @param b: column dimension to get value
	 * 
	 * @return the specified value in the matrix
	 */
	public double get(int a, int b) throws MatrixException {
		if (a > rowVar || b > colVar) {
			throw new MatrixException("Values not in matrix bounds");
		} else if (a < 0 || b < 0) {
			throw new MatrixException("No negative numbers kthx");
		} else {
			return mat[a][b];
		}
	}
	/*
	 * Adds two matrices together
	 * 
	 * @param a: First matrix to add
	 * @param b: Second matrix to add
	 * 
	 * @return the sum matrix
	 */
	public Matrix add(Matrix a, Matrix b) throws MatrixException {
		if (a == null || b == null) {
			throw new MatrixException("Null matrix");

		} else if (a.rowVar != b.rowVar || a.colVar != b.colVar) {
			throw new MatrixException("Matrices are not equal size");
		} else {
			Matrix helper = new Matrix(a.rowVar, a.colVar);

			for (int c = 0; c < a.rowVar; c++) {
				for (int d = 0; d < a.colVar; d++) {
					double val = a.get(c, d) + b.get(c, d);
					helper.set(c, d, val);
				}
			}

			return helper;
		}
	}
	/*
	 * Subtracts two matrices
	 * 
	 * @param a: First matrix to subtract
	 * @param b: Second matrix to subtract
	 * 
	 * @return the difference matrix
	 */
	public Matrix sub(Matrix a, Matrix b) throws MatrixException {
		if (a == null || b == null || a != b) {
			throw new MatrixException("Null matrix");
		} else if (a.rowVar != b.rowVar || a.colVar != b.colVar) {
			throw new MatrixException("Matrices are not equal size");
		} else {
			Matrix helper = new Matrix(a.rowVar, a.colVar);

			for (int c = 0; c < a.rowVar; c++) {
				for (int d = 0; d < a.colVar; d++) {
					double val = a.get(c, d) - b.get(c, d);
					helper.set(c, d, val);
				}
			}

			return helper;
		}
	}
	/*
	 * Multiplies two matrices
	 * 
	 * @param a: First matrix to multiply
	 * @param b: Second matrix to multiply
	 * 
	 * @return the product matrix
	 */
	public Matrix mult(Matrix a, Matrix b) throws MatrixException {
		if (a == null || b == null || a != b) {
			throw new MatrixException("Null matrix");
		} else if (a.rowVar != b.rowVar || a.colVar != b.colVar) {
			throw new MatrixException("Matrices are not equal size");
		} else {
			Matrix helper = new Matrix(a.rowVar, a.colVar);

			for (int c = 0; c < a.rowVar; c++) {
				for (int d = 0; d < a.colVar; d++) {
					double val = a.get(c, d) * b.get(c, d);
					helper.set(c, d, val);
				}
			}

			return helper;
		}
	}
	/*
	 * Multiplies two matrices using scalar multiplication
	 * 
	 * @param a: Matrix to multiply
	 * @param value: Value to multiply each element in the matrix by
	 * 
	 * @return the product matrix
	 */
	public Matrix mult(Matrix a, double value) throws MatrixException {
		if (a == null) {
			throw new MatrixException("Null matrix");
		} else {
			Matrix helper = new Matrix(a.rowVar, a.colVar);

			for (int c = 0; c < a.rowVar; c++) {
				for (int d = 0; d < a.colVar; d++) {
					double val = a.get(c, d) * value;
					helper.set(c, d, val);
				}
			}

			return helper;
		}
	}
	/*
	 * Transposes a matrix
	 * 
	 * @param a: The matrix to transpose
	 * 
	 * @return the new transposed matrix
	 */
	public Matrix transpose(Matrix a) throws MatrixException{
		if (a == null) {
			throw new MatrixException ("Null matrix");
		} else {
			Matrix helper = new Matrix(a.rowVar, a.colVar);
			
			for(int c = 0; c < a.rowVar; c++) {
				for(int d = 0; d < a.colVar; d++) {
					helper.set(d, c, a.get(c, d));
				}
			}
			
			return helper;
		}
	}
	
	
}
