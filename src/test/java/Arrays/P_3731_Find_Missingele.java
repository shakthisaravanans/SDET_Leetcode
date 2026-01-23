package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_3731_Find_Missingele {

	public List<Integer> findMissingElements(int[] nums) {
		List<Integer> Results = new ArrayList<Integer>();
		Arrays.sort(nums);
		int start = nums[0], end = nums[nums.length - 1];
		int[] result = new int[end+1];

		for (int i : nums) {
			result[i]++;
		}

	

		for (int i = start; i < end; i++) {
			if (result[i] == 0) {
				Results.add(i);
			}
		}

		return Results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3731_Find_Missingele sample = new P_3731_Find_Missingele();
		int[] nums = { 5, 1 };
		System.out.println(sample.findMissingElements(nums));
	}

}
