package Arrays;

import java.util.HashMap;

public class P2537_Goodsubarray {

	public long countGood1(int[] nums, int k) {

		HashMap<Integer, Integer> freq = new HashMap<>();
		// freq.put(3,1);
		int count = freq.getOrDefault(3, 0);
		/*
		 * Step 1 : need to specify left and right = 0 pointers and paircount =0 and
		 * hasshmap Step 2 : while(l<nums.lenth) and if(paircount
		 * !=k){map.put(nums[r]+1) r++;
		 */
		return 0L;
	}

	public long countGood(int[] nums, int k) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		int left = 0;
		long pairs = 0;
		long result = 0;

		for (int right = 0; right < nums.length; right++) {
			int val = nums[right];
			int count = freq.getOrDefault(val, 0);
			pairs += count;
			freq.put(val, count + 1);

			while (pairs >= k) {
				// all subarrays from left to right are valid
				result += nums.length - right;

				// shrink window from left
				int leftVal = nums[left];
				int leftCount = freq.get(leftVal);
				pairs -= (leftCount - 1); // removing 1 reduces (leftCount - 1) pairs
				freq.put(leftVal, leftCount - 1);
				left++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2537_Goodsubarray s = new P2537_Goodsubarray();

		int[] nums1 = { 3, 1, 4, 3, 2, 2, 4 };
		int[] nums = { 1, 1, 1, 1, 1 };

		System.out.println(s.countGood(nums, 10));
	}

}
