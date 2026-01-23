package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_2918_minimum_equal_sum_of_two_arrays {

	public long minSum(int[] nums1, int[] nums2) {

		/*
		 * 
		 * Step 1 : sum all num1 element in array and also count zero of nums1 if any
		 * ,and also if it is zero and add zero with nums
		 *
		 * Step 2 : Same way please do for num2 also
		 *
		 * Step 3 : check sumnum1<sumnums2 and also zero1 ==0 then return -1 becs of
		 * num1 dont have max sum and
		 * 
		 * to compensate we dont have zero too so it will be -1
		 * 
		 * step 4 : sameway do for sumnum2 also step 3
		 * 
		 * step 5 : return the max of sum of array.
		 * 
		 * 
		 */

		long sumN1 = 0, sumN2 = 0;
		int zero1 = 0, zero2 = 0;

		for (int i : nums1) {

			if (i == 0) {
				zero1++;
			}
			sumN1 += i;
		}
		sumN1 += zero1;

		for (int i : nums2) {

			if (i == 0) {
				zero2++;
			}
			sumN2 += i;
		}
		sumN2 += zero2;

		if ((zero2 == 0 && sumN2 < sumN1) || (zero1 == 0 && sumN1 < sumN2)) {
			return -1;
		}
		return Math.max(sumN2, sumN1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 1, 3, 0 }; // [0,1,2,4,5,3]
		int[] nums1 = { 2, 2, 8, 8, 2 }; // 2

		P_2918_minimum_equal_sum_of_two_arrays s = new P_2918_minimum_equal_sum_of_two_arrays();
		System.out.println(s.minSum(nums, nums1));
	}

}
