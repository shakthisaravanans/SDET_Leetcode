package Arrays;

import java.util.Arrays;

public class P_1051_Height_Checker {

	public int heightChecker(int[] heights) {

		int count = 0;

		int[] temp = Arrays.copyOf(heights,heights.length);

		Arrays.sort(temp);

		for (int i = 0; i < heights.length; i++) {
			if (temp[i] != heights[i]) {
				count++;
			}
		}
		
	

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1051_Height_Checker sample = new P_1051_Height_Checker();
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		System.out.println(sample.heightChecker(heights));
	}

}
