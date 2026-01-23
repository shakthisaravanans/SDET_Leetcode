package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/*Input: digits = [1,2,3,4]

Output: 12

Explanation: The 12 distinct 3-digit even numbers that can be formed are
 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 
 cannot be formed because there is only 1 copy of the digit 2.
*/

public class P_2094_unq_3_digit_with_array {

	public int[] findEvenNumbers1(int[] digits) {

		/*
		 * Step1 : using 3 for loop till it end of conditions, hash set
		 * 
		 * Step 2 : 1st loop need to check it should not be 0
		 * 
		 * step 3 : 2nd loop should not be ith / 1st index or need to continue
		 * 
		 * step 4 : 3nd loop should not be ith & jth / 1st & 2nd index or need to
		 * continue
		 * 
		 * step 5 : check unit value is even then passed to set
		 * 
		 * step 6 : count the set.
		 */

		HashSet<Integer> threedigit = new HashSet<>();

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 2 != 0) {
				continue;
			}

			for (int j = 0; j < digits.length; j++) {
				if (i == j) {
					continue;
				}

				for (int k = 0; k < digits.length; k++) {
					if (k == j || k == i || digits[k] == 0) {
						continue;
					}

					threedigit.add(digits[k] * 100 + digits[j] * 10 + digits[i] * 1);
				}
			}
		}

		int[] arraynum = new int[threedigit.size()];
		int count = 0;
		for (int nums : threedigit) {
			arraynum[count++] = nums;
		}
		Arrays.sort(arraynum);
		return arraynum;
	}

	public int[] findEvenNumbers(int[] digits) {

		/*
		 * Step1 : using 3 for loop till it end of conditions, hash set
		 * 
		 * Step 2 : 1st loop need to check it should not be 0
		 * 
		 * step 3 : 2nd loop should not be ith / 1st index or need to continue
		 * 
		 * step 4 : 3nd loop should not be ith & jth / 1st & 2nd index or need to
		 * continue
		 * 
		 * step 5 : check unit value is even then passed to set
		 * 
		 * step 6 : count the set.
		 */

		// HashSet<Integer> threedigit = new HashSet<>();

		boolean[] threedigit = new boolean[1000];
		int count = 0;

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 2 != 0) {
				continue;
			}

			for (int j = 0; j < digits.length; j++) {
				if (i == j) {
					continue;
				}

				for (int k = 0; k < digits.length; k++) {
					if (k == j || k == i || digits[k] == 0) {
						continue;
					}

					threedigit[digits[k] * 100 + digits[j] * 10 + digits[i] * 1] = true;
					

				}
			}
		}
		int[] arraynum = new int[100];
		for (int m = 100; m < 1000; m++) {
			if (threedigit[m]) {
				arraynum[count++] = m;
			}
		}
		

		return Arrays.copyOf(arraynum,count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 1, 3, 0 }; // [0,1,2,4,5,3]
		int[] nums1 = {2,2,8,8,2}; // 2

		P_2094_unq_3_digit_with_array s = new P_2094_unq_3_digit_with_array();
		System.out.println(s.findEvenNumbers(nums1));
	}

}
