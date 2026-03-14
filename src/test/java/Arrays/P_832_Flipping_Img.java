package Arrays;

public class P_832_Flipping_Img {

	public int[][] flipAndInvertImage(int[][] image) {

		int row = image.length;
		int col = image[0].length;
		int[][] results = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0, Temp = 2; j < col; j++, Temp--) {
				results[i][Temp] = image[i][j] ^ 1;
			}
		}

		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_832_Flipping_Img sample = new P_832_Flipping_Img();
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 }, { 0, 1, 0 } };

		System.out.println(sample.flipAndInvertImage(image));
	}

}
