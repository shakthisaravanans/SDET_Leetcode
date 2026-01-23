package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_961_N_repetedElements {

	public int repeatedNTimes1(int[] nums) {

		Arrays.sort(nums);

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return nums[i];
			}
		}

		return 0;

	}

	public int repeatedNTimes(int[] nums) {

		// Arrays.sort(nums);

		// Using Set

		Set<Integer> test = new HashSet<Integer>();

		for (int i : nums) {
			if (!test.add(i)) {
				return i;
			}
		}

		return 0;

	}

	public static void main(String[] args) {

		int[] nums = { 2, 1, 2, 5, 3, 2 };
		P_961_N_repetedElements sampl = new P_961_N_repetedElements();

		System.out.println(sampl.repeatedNTimes(nums));

		// TODO Auto-generated method stub

	}

}
