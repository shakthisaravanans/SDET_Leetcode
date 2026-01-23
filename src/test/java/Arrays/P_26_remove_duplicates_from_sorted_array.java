package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_26_remove_duplicates_from_sorted_array {
	public int removeDuplicates1(int[] nums) {

		HashSet<Integer> setss = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			setss.add(nums[i]);
		}

		Arrays.fill(nums, '_');
		ArrayList<Integer> lists = new ArrayList<Integer>(setss);
		Collections.sort(lists);
		for (int j = 0; j < lists.size(); j++) {
			nums[j] = lists.get(j);
		}

		return setss.size();

	}

	public int removeDuplicates7(int[] nums) {

		/*
		 * Two pointer array we can use forloop also like let left 0 and right is 1
		 * check left ==right if not equal we can right to next to get all possible
		 * values
		 * 
		 * else if it is equal then copy that right index to left till it reach end we
		 * need to do same
		 * 
		 */

		int l = 0;
		for (int r = 0; r < nums.length; r++) {
			if(nums[l]!=nums[r])
			{
				l++;
				nums[l]=nums[r];
			}
			

		}

		return l+1;

	}

	public int removeDuplicates3(int[] nums) {
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] != nums[i]) {
				nums[++j] = nums[i];
			}
		}
		Arrays.fill(nums, j + 1, nums.length - 1, '_');
		return j + 1;
	}

	public int removeDuplicates(int[] nums) {
		int l = 0, r = 1;

		while (r < nums.length) {
			if (nums[l] != nums[r]) {
				l++;
				nums[l] = nums[r];

			}
			r++;
		}
		Arrays.fill(nums, l + 1, nums.length, '_');
		System.out.println(Arrays.toString(nums));
		return l + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		P_26_remove_duplicates_from_sorted_array s = new P_26_remove_duplicates_from_sorted_array();
		System.out.println(s.removeDuplicates7(nums));
	}

}
