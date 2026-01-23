package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_442_Find_all_Dups {

	public List<Integer> findDuplicates1(int[] nums) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1; // find index based on value

			if (nums[index] < 0) {
				// if already negative → duplicate found
				result.add(index + 1);
			} else {
				// mark as visited by making it negative
				nums[index] = -nums[index];
			}
		}

		return result;

	}

	public List<Integer> findDuplicates(int[] nums) {

		List<Integer> l = new ArrayList<Integer>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1]) {
				l.add(nums[i]);
			}

		}

		return l;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_442_Find_all_Dups sample = new P_442_Find_all_Dups();

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(sample.findDuplicates1(nums));
	}

}
