package Arrays;

import java.util.Iterator;

public class P_3423_maximum_difference_between_adjacent {

	public int maxAdjacentDistance(int[] nums) {

		int Len=nums.length-1,temp = Math.abs(nums[Len] - nums[0]);

		for (int i = 1; i <=Len; i++) {

			temp=Math.max(temp,Math.abs(nums[i] - nums[i - 1]));

//			if (Math.abs(nums[i] - nums[i - 1]) > temp) {
//
//				temp = Math.abs(nums[i] - nums[i - 1]);
//			}

		}

//		if (Math.abs(nums[nums.length - 1] - nums[0]) > temp) {
//
//			temp = Math.abs(nums[nums.length - 1] - nums[0]);
//		}

		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3423_maximum_difference_between_adjacent s = new P_3423_maximum_difference_between_adjacent();

		int[] a = { 1, 2, 4 };
		int[] b = { -5, -10, -5 };

		System.out.println(s.maxAdjacentDistance(a));
	}

}
