package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class P_1865_FindPairs {

	HashMap<Integer, Integer> maps2 = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> maps1 = new HashMap<Integer, Integer>();
	List<Integer> sortedl1;
	int[] arr2;

	public void FindSumPairs(int[] nums1, int[] nums2) {
		// arr1 = nums1;
		arr2 = nums2;

		for (int i : nums1) {
			maps1.put(i, 1);
		}

		sortedl1 = new ArrayList<Integer>(maps1.keySet());
		Collections.sort(sortedl1);

		System.out.println(sortedl1);
		for (int i : nums2) {
			maps2.put(i, maps2.getOrDefault(i, 0) + 1);
		}

	}

	public void add(int index, int val) {

		int OldVal = arr2[index];
		int NewVal = OldVal + val;
		arr2[index] = NewVal;
		maps2.put(OldVal, maps2.getOrDefault(OldVal, 0) - 1);
		maps2.put(NewVal, maps2.getOrDefault(NewVal, 0) + 1);
	}

	public int count(int tot) {

		int count = 0;
		for (int j : sortedl1) {

			if (j > tot)
				break;

			Integer map2val = maps2.get(tot - j);
			if (map2val != null) {
				count += maps1.get(j) * map2val;
			}

			// if (maps.containsKey(tot - j)) {
			// count += maps.get(tot - j);
			// }
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_1865_FindPairs sample = new P_1865_FindPairs();

		int[] num1 = { 1, 1, 2, 2, 2, 3 };
		int[] num2 = { 1, 4, 5, 2, 5, 4 };

		/*
		 * ["FindSumPairs", "count", "add", "count", "count", "add", "add", "count"]
		 * [[[1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]], [7], [3, 2], [8], [4], [0, 1], [1,
		 * 1], [7]]
		 * 
		 */

		sample.FindSumPairs(num1, num2);
		System.out.println(sample.count(7));
		sample.add(3, 2);
		System.out.println(sample.count(8));
		System.out.println(sample.count(4));
		sample.add(0, 1);
		sample.add(1, 1);
		System.out.println(sample.count(7));

	}

}
