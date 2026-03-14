package Arrays;

import java.util.Arrays;

public class P_1984_min_high_low {

	public int minimumDifference(int[] nums, int k) {

		
		Arrays.sort(nums);
		int Result =nums[k-1]-nums[0],Len = nums.length;
		
		for(int i=0;i+k-1<Len;i++)
		{
			Result = Math.min(Result,nums[i+k-1]-nums[i]);
		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1984_min_high_low sample = new P_1984_min_high_low();

		int[] nums = { 9, 4, 1, 7 };
		System.out.println(sample.minimumDifference(nums, 2));
	}

}
