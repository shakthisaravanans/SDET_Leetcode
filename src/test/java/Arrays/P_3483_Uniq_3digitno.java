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

public class P_3483_Uniq_3digitno {
	 public int totalNumbers(int[] digits) {
	        // Set<Integer> threedigit = new HashSet<>();

			// for (int i = 0; i < digits.length; i++) {
			// 	if (digits[i] == 0) {
			// 		continue;
			// 	}

			// 	for (int j = 0; j < digits.length; j++) {
			// 		if (i == j) {
			// 			continue;
			// 		}

			// 		for (int k = 0; k < digits.length; k++) {
			// 			if (k == j || k == i || digits[k] % 2 != 0) {
			// 				continue;
			// 			}

			// 			threedigit.add(digits[i] * 100 + digits[j] * 10 + digits[k] * 1);
			// 		}
			// 	}
			// }
			// return threedigit.size();


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
			return threedigit.size();
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,1,3,0 }; // [0,1,2,4,5,3]
		int[] nums1 = { 0, 2, 2 }; // 2

		P_3483_Uniq_3digitno s = new P_3483_Uniq_3digitno();
		System.out.println(s.totalNumbers(nums));
	}

}
