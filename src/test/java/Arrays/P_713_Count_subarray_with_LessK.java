package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class P_713_Count_subarray_with_LessK {

	public int numSubarrayProductLessThanK1(int[] nums, int k) {

		int Prod = 1, l = 0, r = 0, countsubarray = 0;

		while (r < nums.length) {
			Prod *= nums[r++];

			while (Prod >= k) 	
				Prod /= nums[l++];
				countsubarray += r - l;

			
			
		}

		return countsubarray;

	}
	
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        int Prod = 1, l = 0, countsubarray = 0,Len=nums.length;
		for (int r=0;r<Len;r++) {
			Prod *= nums[r];
			while (Prod >= k && l <= r) {
				Prod /= nums[l++];
				countsubarray += r - l;
			}
			//countsubarray += r - l + 1;
		}
		return countsubarray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 5, 2, 6 }; // 100

		int[] b = { 1, 2, 3 }; // 0

		P_713_Count_subarray_with_LessK s = new P_713_Count_subarray_with_LessK();
		System.out.println(s.numSubarrayProductLessThanK(b, 0));

	}

}
