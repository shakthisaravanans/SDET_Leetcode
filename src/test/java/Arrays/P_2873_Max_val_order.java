package Arrays;

import java.util.Arrays;

public class P_2873_Max_val_order {
	public long maximumTripletValue1(int[] nums) {
		int nLen = nums.length;
		int[] maxz = new int[nLen];
		maxz[nLen - 1] = nums[nLen - 1];
		long maxx = nums[0];
		long maxtriple = 0l;
		for (int i = nLen - 2; i > 0; i--) {

			maxz[i] = Math.max(nums[i], maxz[i + 1]);
		}

		System.out.println(Arrays.toString(maxz));

		for (int y = 1; y < nLen - 1; y++) {
			System.out.println((maxx - nums[y]) * maxz[y]);
			maxtriple = Math.max((maxx - nums[y]) * maxz[y], maxtriple);

			maxx = Math.max(maxx, nums[y]);

		}
		return maxtriple;

	}

	public long maximumTripletValue(int[] nums) {

		int nLen = nums.length;
		int[] maxz = new int[nLen];
		int[] maxx = new int[nLen];
		maxz[nLen - 1] = nums[nLen - 1];
		maxx[0] = nums[0];
		long maxtriple = 0l;
		for (int z = nLen - 2; z > 0; z--) {
			maxz[z] = Math.max(nums[z], maxz[z + 1]);
		}

		for (int x = 1; x < nLen - 1; x++) {
			maxx[x] = Math.max(nums[x], maxx[x - 1]);
		}
		for (int y = 1; y < nLen - 1; y++) {

			maxtriple = Math.max(((maxx[y - 1] - nums[y]) * maxz[y + 1]), maxtriple);
		}

		return maxtriple;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2873_Max_val_order s = new P_2873_Max_val_order();
		int[] nums1 = { 12, 6, 1, 2, 7 };
		int[] nums = { 10, 13, 6, 2 };
		System.out.println(s.maximumTripletValue(nums));
	}

}
