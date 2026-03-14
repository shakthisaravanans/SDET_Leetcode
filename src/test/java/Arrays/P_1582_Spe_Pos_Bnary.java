package Arrays;

public class P_1582_Spe_Pos_Bnary {

	public int numSpecial(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		int[] rowpos = new int[row];
		int[] colpos = new int[col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 1) {
					rowpos[i]++;
					colpos[j]++;

				}
			}
		}

		int ans = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 1 && rowpos[i] == 1 && colpos[j] == 1) {
					ans++;

				}
			}
		}
		
	

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1582_Spe_Pos_Bnary sample = new P_1582_Spe_Pos_Bnary();
		int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		System.out.println(sample.numSpecial(mat));
	}

}
