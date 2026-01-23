package Arrays;

import java.util.HashMap;

public class P_2176_CountEqual_Div_pair {

//	Input: nums = [1,2,3,1], k = 3
//			Output: true
//		

	public boolean containsNearbyDuplicate1(int[] nums, int k) {
		/*
		 * brute force : nester forloop if it match condiation conditions of j-i <k
		 * return true
		 * 
		 * else fasle in last iterations
		 * 
		 * Time Limit Exceeded (n2)
		 * 
		 */

		// Time Limit Exceeded
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					if ((j - i) <= k) {
						return true;
					}
				}
			}

		}
		return false;
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		/*
		 * creats hashmap add them with key as numsvalue and index check if
		 * maps.contains numvale if yes get and add sum and check with k if less return
		 * true else after loop put as fasle
		 */

		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (maps.containsKey(nums[i])) {
				if ((i - maps.get(nums[i])) <= k) {
					return true;

				}
			}

			maps.put(nums[i], i);
		}

		return false;
	}
	
	public int countPairs1(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
			if (nums[i] == nums[j] && (i * j) % k == 0) {
					count++;
				}
			}
		}
		return count;

	}
	
	public int countPairs(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
			if (nums[i] == nums[j] && (i * j) % k == 0) {
					count++;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 0, 1, 1 };
		P_2176_CountEqual_Div_pair s = new P_2176_CountEqual_Div_pair();
		System.out.println(s.containsNearbyDuplicate(nums, 1));

	}

}
