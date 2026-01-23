package Arrays;

public class P_2006_Countno {

	public int countKDifference1(int[] nums, int k) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (Math.abs(nums[i] - nums[j]) == k) {
					count++;
				}
			}
		}

		return count;

	}

	public int countKDifference(int[] nums, int k) {

		int count = 0;
		int[] counts = new int[201];
		for (int i : nums) {
			if ((i - k) > 0) {
				count += counts[i - k];
			}
			count += counts[i + k];
			counts[i]++;

		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2006_Countno sample = new P_2006_Countno();
		int[] nums = {1,2,2,1};
		System.out.println(sample.countKDifference(nums, 1));

	}

}
