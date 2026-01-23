package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class P_594_Lng_subseq {

	public int findLHS1(int[] nums) {

		/*
		 * Step1 : count long count 0
		 * 
		 * Step 2 Check i j as abs ==1 the count 1 else break
		 * 
		 */

		int ResultCount = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			int Count = 0;
			for (int j = i + 1; j < nums.length; j++) {

				if (Math.abs(nums[i] - nums[j]) != 1) {

					break;
				}
				Count++;
			}

			ResultCount = Math.max(ResultCount, Count);
		}

		return ResultCount;

	}

	public int findLHS2(int[] nums) {

		Arrays.sort(nums);
		int ResultCount = -1;

		for (int i = 1; i < nums.length; i++) {
			if (Math.abs(nums[i] - nums[i - 1]) == 1) {
				int count = 0;
				int j = i + 1;
				while (j < nums.length && nums[j] == nums[i]) {
					count++;
					j++;
				}

				ResultCount = Math.max(ResultCount, count);
			}

		}

		return ResultCount + 2;

	}

	public int findLHS(int[] nums) {

		Map<Integer, Integer> Maps = new HashMap<Integer, Integer>();
		for (int i : nums) {
			Maps.put(i, Maps.getOrDefault(i, 0) + 1);
		}

		int ResultCount = 0;
		for (int key : Maps.keySet()) {
			if (Maps.containsKey(key + 1)) {
				ResultCount = Math.max(Maps.get(key) + Maps.get(key + 1), ResultCount);
			}

		}

		return ResultCount;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_594_Lng_subseq sample = new P_594_Lng_subseq();

		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };

		System.out.println(sample.findLHS(nums));
	}

}
