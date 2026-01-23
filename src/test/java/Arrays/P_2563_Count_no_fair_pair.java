package Arrays;

import java.util.Arrays;

public class P_2563_Count_no_fair_pair {

	public long countFairPairs(int[] nums, int lower, int upper) {

		/*
		 * sort array get 1st no of array and * check left pointer till it reach greater
		 * then once done check right pointer from right to left then once it reach less
		 * then upper bound
		 * 
		 * count = count + (Right -left);
		 * 
		 */
		Arrays.sort(nums);
		int Count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int lowerbound = lower - nums[i];
			int upperbound = upper - nums[i];
			int right = nums.length - 1, left = i + 1;

			while (lowerbound > nums[left] && left < nums.length-1) {
				left++;
			}

//			for (int l = i + 1; l < nums.length; l++) {
//				if (lowerbound <= nums[l]) {
//					break;
//				}
//				left++;
//			}

			while (upperbound < nums[right] && right > left - 1) {
				right--;
			}
//			for(int r=nums.length-1;r>i;r--)
//			{
//				if(upperbound>=nums[r])
//				{
//					break;
//				}
//				right--;
//			}

			Count += (right - left) + 1;
		}

		return Count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2563_Count_no_fair_pair s = new P_2563_Count_no_fair_pair();
		int[] nums = { 1, 7, 9, 2, 5 }; // 1 2 5 7 9

		String[] a = {"Shakthi","KSakthi","Jack","Jil"};
		//Aravind
		//bala  //1,19,2,3,
		Arrays.sort(a);
		System.out.println(a);
		
		System.out.println(s.countFairPairs(nums, 11, 11));
	}

}
