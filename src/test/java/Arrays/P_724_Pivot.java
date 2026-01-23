package Arrays;

import java.util.Arrays;

public class P_724_Pivot {

	public int pivotIndex(int[] nums) {

		int[] LeftPivot = Arrays.copyOf(nums, nums.length);
		int[] RightPivot = Arrays.copyOf(nums, nums.length);

		for (int i = 1; i < nums.length; i++) {

			LeftPivot[i] += LeftPivot[i - 1];
			RightPivot[nums.length - 1 - i] += RightPivot[nums.length - i];

		}

		int Leftindex = 0, rightindex = 0;
		for (int i = 0; i < nums.length; i++) {

			if (i == 0) {
				Leftindex = 0;
			} else {
				Leftindex = LeftPivot[i - 1];
			}
			if (i == nums.length - 1) {
				rightindex = 0;
			} else {
				rightindex = RightPivot[i + 1];
			}
			
			if(Leftindex==rightindex) {
				return i;
			}
			

		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_724_Pivot sample = new P_724_Pivot();

		int[] nums = {2,1,-1};
		System.out.println(sample.pivotIndex(nums));
	}

}
