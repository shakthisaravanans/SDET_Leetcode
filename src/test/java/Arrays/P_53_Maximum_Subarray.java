package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_53_Maximum_Subarray {

	public int maxSubArray(int[] nums) {

		/*
		 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray
		 * [4,-1,2,1] has the largest sum 6.
		 */

		for (int r = 0; r < nums.length; r++) {
			for (int l = 0; l < nums.length; l++) {

			}
		}
		return 0;

	}

	public int maxSubArray1(int[] nums) {

		/*
		 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray
		 * [4,-1,2,1] has the largest sum 6.
		 */
		int[] nums1 = new int[nums.length];
		nums1[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums1[i] = nums[i] + nums[i - 1];
		}

		System.out.println(Arrays.toString(nums1));

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // 6
		int[] nums1 = { 5, 4, -1, 7, 8 }; // 23

		P_53_Maximum_Subarray s = new P_53_Maximum_Subarray();
		System.out.println(s.maxSubArray(nums));
	}

}
