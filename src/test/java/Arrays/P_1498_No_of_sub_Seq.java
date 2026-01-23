package Arrays;

import java.util.Iterator;

public class P_1498_No_of_sub_Seq {

	public int numSubseq(int[] nums, int target) {

		int resultcount = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if(nums[i]+nums[j]>target)
				{
					break;
				}
				resultcount++;
			}
		}

		return resultcount;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1498_No_of_sub_Seq sample = new P_1498_No_of_sub_Seq();

		int[] nums = { 3, 5, 6, 7 };
		sample.numSubseq(nums, 9);
		System.out.println(sample.numSubseq(nums, 9));
	}

}
