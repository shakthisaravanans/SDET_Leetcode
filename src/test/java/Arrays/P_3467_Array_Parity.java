package Arrays;

import java.util.Arrays;

public class P_3467_Array_Parity {
	public int[] transformArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				nums[i] = 0;
			} else {
				nums[i] = 1;
			}
		}

		Arrays.sort(nums);

		return nums;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 1 };
		P_3467_Array_Parity sample = new P_3467_Array_Parity();
		System.out.println(sample.transformArray(nums));
	}

}
