package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P_3392_Count_subarrayof_Length {

	public int countSubarrays(int[] nums) {

		/*
		 * Step 1 : Intilizsed Int as count =0 and
		 * 
		 * Step 2 : fortill length-2 to cutshot loop
		 * 
		 * Step 3 : num1+num3 == nums[2]/2 {count++}
		 * 
		 * Step 4 : return count
		 * 
		 * 
		 * 
		 */

		int Count = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			if ((double) nums[i + 1] / 2 == (double) (nums[i] + nums[i + 2])) {
				Count++;
			}

		}
		return Count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { -1, -4, -1, 4 }; // 0 -2 0+-4 = -4/2 -2

		int[] b = { 1, 1, 1 }; // 0

		P_3392_Count_subarrayof_Length s = new P_3392_Count_subarrayof_Length();
		System.out.println(s.countSubarrays(a));

	}

}
