package Arrays;

public class P_3356_zero_array_transformation_ii {

	public int minZeroArray(int[] nums, int[][] queries) {

		int count = 0;
		if (checknums(nums)) {
			return count;
		}
		for (int j = 0; j < queries.length; j++) {
			int l = queries[j][0];
			while (l <= queries[j][1]) {
				nums[l] = nums[l] - queries[j][2];
				l++;
			}
			count++;
		
		}
		if (checknums(nums)) {
			return count;
		}

		return -1;

	}

	public boolean checknums(int[] nums) {
		
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3356_zero_array_transformation_ii s = new P_3356_zero_array_transformation_ii();

		int[] nums1 = { 7, 6, 8 };
		int[][] queries1 = { { 0, 0, 2 }, { 0, 1, 5 }, { 2, 2, 5 }, { 0, 2, 4 } };

		int[] nums = { 4, 3, 2, 1 };
		int[][] queries = { { 1, 3, 2 }, { 0, 2, 1 } };
		System.out.println(s.minZeroArray(nums1, queries1));
	}

}
