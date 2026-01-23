package Arrays;

import java.util.Arrays;

public class P_561_Array_Partitions {

	public int arrayPairSum(int[] nums) {

		Arrays.sort(nums);
		int Sum =0;
		
		for(int i=0;i<nums.length;i=i+2)
		{
			Sum+=nums[i];
		}

		return Sum;

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_561_Array_Partitions sample = new P_561_Array_Partitions();
		int[] nums = {1,4,3,2};

		System.out.println(sample.arrayPairSum(nums));

	}

}
