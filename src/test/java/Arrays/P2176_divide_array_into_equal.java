package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class P2176_divide_array_into_equal {

	/*
	 * Input: nums = [3,1,2,2,2,1,3], k = 2 Output: 4 Step 1 : initlized count as 0
	 * step 2 : make 2 forloop on is count first and 2nd for compare the equal pair
	 * Step 3 : if values of i and j is equal/pair is equal then (i*j)/k==0{count++}
	 * loop till end of i forllop
	 * 
	 */
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

		Map<Integer,List<Integer>> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			map.computeIfAbsent(nums[i],x -> new ArrayList<Integer>()).add(i);
		}
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2176_divide_array_into_equal s = new P2176_divide_array_into_equal();
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(s.countPairs(nums, 1));

	}

}
