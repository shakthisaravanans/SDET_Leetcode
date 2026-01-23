package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class P2200_Find_all_K_Dis {

	public List<Integer> findKDistantIndices1(int[] nums, int key, int k) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == key) {

				int j = (i - k) < 0 ? 0 : i - k;

				while (j < nums.length && j <= k + i) {
					set.add(j);
					j++;
				}
			}

		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		return list;

	}

	public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

		List<Integer> listKey = new ArrayList<Integer>();

		List<Integer> Result = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				listKey.add(i);
			}
		}

		for (int i = 0; i < nums.length; i++) {

			for (int s : listKey) {
				if (Math.abs(i - s) <= k) {
					Result.add(i);
					break;
				}
			}
		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2200_Find_all_K_Dis sample = new P2200_Find_all_K_Dis();

		int[] nums = {3,4,9,1,3,9,5};
		System.out.println(sample.findKDistantIndices(nums, 9, 1));
	}

}
