package Arrays;

import java.util.Arrays;

public class P_268_Missing_Number {

	public int missingNumber(int[] nums) {

		int Len = nums.length;

		Arrays.sort(nums);

		int count = nums[0];

		for (int i = 1; i < Len; i++) {
			if (++count != nums[i]) {
				return count;
			}

		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_268_Missing_Number sample = new P_268_Missing_Number();
		int[] nums = { 3, 0, 1 };

		System.out.println(sample.missingNumber(nums));
	}

}
