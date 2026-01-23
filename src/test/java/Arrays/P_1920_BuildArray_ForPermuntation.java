package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_1920_BuildArray_ForPermuntation {

	public String buildArray(int[] nums) {
		
		/*
		 * we need to construct array based on nums array
		 */
		int[] buildarrays = new int[nums.length];
	int index =0;
		for(int in : nums) {
			buildarrays[index++]=nums[in];
		}
		return Arrays.toString(buildarrays);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 2, 1, 5, 3, 4 }; // [0,1,2,4,5,3]
		int[] nums1 = { 5, 4, -1, 7, 8 }; // 23

		P_1920_BuildArray_ForPermuntation s = new P_1920_BuildArray_ForPermuntation();
		System.out.println(s.buildArray(nums));
	}

}
