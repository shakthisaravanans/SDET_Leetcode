package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P_3487_Max_UniqSub {

	public int maxSum1(int[] nums) {

		Set<Integer> set = new HashSet<Integer>();
		int Sum = 0;
		for (int i : nums) {

			if (set.add(i)) {
				if (i > 0) {
					Sum += i;
				}
			}

		}
		return (Sum == 0) ? Collections.max(set) : Sum;

	}

	public int maxSum(int[] nums) {

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3487_Max_UniqSub sample = new P_3487_Max_UniqSub();
		int[] nums = { -100 };
		System.out.println(sample.maxSum1(nums));
	}

}
