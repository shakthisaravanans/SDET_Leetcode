package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class P_2465_No_of_Avg {
	public int distinctAverages(int[] nums) {

		Arrays.sort(nums);

		// double[] a = new double[nums.length];

		HashSet<Double> result = new HashSet<Double>();

		int l = 0, r = nums.length - 1;
		while (l < r) {

			result.add((double) (nums[l] + nums[r]) / 2);
			l++;
			r--;
		}

		return result.size();

	}

	public double minimumAverage(int[] nums) {
		Arrays.sort(nums);
		int l = 0, r = nums.length - 1;
		double result = Double.MAX_VALUE;
		while (l < r) {
			result = Math.min((double) (nums[l] + nums[r]) / 2, result);
			l++;
			r--;
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2465_No_of_Avg sample = new P_2465_No_of_Avg();

		int[] nums = { 4, 1, 4, 0, 3, 5 };
		int[] nums1 = { 7, 8, 3, 4, 15, 13, 4, 1 };

		System.out.println(sample.minimumAverage(nums1));
		// System.out.println(sample.distinctAverages(nums1));
	}

}
