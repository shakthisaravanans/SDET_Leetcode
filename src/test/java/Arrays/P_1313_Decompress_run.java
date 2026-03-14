package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class P_1313_Decompress_run {

	public int[] decompressRLElist(int[] nums) {

		int Count = 0, MapCount = 0;

		for (int i = 0; i < nums.length; i += 2) {
			
			Count += nums[i];
		}

		int[] result = new int[Count];

		for (int i = 0; i < nums.length; i += 2) {
			
			for(int j=0;j<nums[i];j++)
			{
				result[MapCount++] = nums[i+1];
			}

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1313_Decompress_run sample = new P_1313_Decompress_run();
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(sample.decompressRLElist(nums));
	}

}
