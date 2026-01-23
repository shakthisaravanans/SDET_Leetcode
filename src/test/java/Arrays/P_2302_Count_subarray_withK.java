package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class P_2302_Count_subarray_withK {

	public long countSubarrays(int[] nums, long k) {

		int maxnum = 0, l = 0;
		long countsubarray = 0, countk = 0;
		for (int i : nums) {
			maxnum = Math.max(i, maxnum);
		}

		for (int r = 0; r < nums.length; r++) {
			if (nums[r] == maxnum) {
				countk++;
			}

			while (countk >= k && l <=r) {
				countsubarray+= nums.length - r;

				if (nums[l++] == maxnum) {
					countk--;
				}

			}

		}
		return countsubarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 2, 3, 3 }; // 6
		
		int[] b = { 1,4,2,1}; // 3

		P_2302_Count_subarray_withK s = new P_2302_Count_subarray_withK();
		System.out.println(s.countSubarrays(b, 3));

	}

}
