package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P_2799Count_Completed_subarray {

	public int countCompleteSubarrays(int[] nums) {

		/*
		 * Step 1 : get array and put set and get size of it
		 * 
		 * Step2 : for(till end of loop i-sizeofset)
		 * 
		 * step3 : while loop till end of array check if size set is size of temp set if
		 * equal break
		 * 
		 * step 4 : num.length-right+1 // to count rest of num
		 * 
		 * step 5 return count
		 * 
		 */

		// Set<Integer> orginalset =
		// Arrays.stream(nums).boxed().collect(Collectors.toSet());

//		Set<Integer> orginalset = new HashSet<Integer>(1000);
//		for (int num : nums) {
//			orginalset.add(num);
//		}
		HashMap<Integer, Integer> orginalset = new HashMap<>(500);

		for (int num : nums) {
			orginalset.put(num, null);
		}

		int orgSize = orginalset.size(), Count = 0, Len = nums.length;
		HashMap<Integer, Integer> maps = new HashMap<>(500);
		for (int i = 0; i <= Len - orgSize; i++) {
			int right = i;
			// Set<Integer> temp = new HashSet<Integer>();

			

			while (right < Len & maps.size() < orgSize) {
				// temp.add(nums[right++]);
				maps.put(nums[right++], null);
			}

			if (maps.size() == orgSize) {
				Count += Len - right + 1;
			}
			
			maps.clear();
		}

		return Count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 1, 2, 2 };

		int[] b = { 5, 5, 5, 5 };

		P_2799Count_Completed_subarray s = new P_2799Count_Completed_subarray();
		System.out.println(s.countCompleteSubarrays(b));

	}

}
