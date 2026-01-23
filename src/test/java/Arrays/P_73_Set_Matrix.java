package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_73_Set_Matrix {

	public void buildArray(int[][] matrix) {

		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];

		int Rowlen = row.length;
		int Collen = row.length;

		for (int i = 0; i < Rowlen; i++) {
			for (int j = 0; j < Collen; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < Rowlen; i++) {
			for (int j = 0; j < Collen; j++) {
				if (row[i] || col[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		
		
		
		
		
		
		
		

		System.out.println(Arrays.deepToString(matrix));
		/*
		 * we need to construct array based on matrix array
		 */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } }; // [0,1,2,4,5,3]
		int[][] matrix1 = { { 1, 1, 1, 0 }, { 1, 0, 1, 0 }, { 1, 1, 1, 0 } };

		P_73_Set_Matrix s = new P_73_Set_Matrix();
		s.buildArray(matrix);
		// System.out.println(s.buildArray(matrix));
	}

}
