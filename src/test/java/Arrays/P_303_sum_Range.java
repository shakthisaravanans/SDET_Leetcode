package Arrays;

public class P_303_sum_Range {

	int[] Parr;

	public void NumArray(int[] nums) {
		Parr = new int[nums.length];
		Parr[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			Parr[i] = Parr[i - 1] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
	return (left==0)?Parr[right]:Parr[right] - Parr[left - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_303_sum_Range sample = new P_303_sum_Range();
		
		//P_303_sum_Range numArray = new P_303_sum_Range({-2, 0, 3, -5, 2, -1});
		int[] nums = { -2, 0, 3, -5, 2, -1 };
		sample.NumArray(nums);

		// System.out.println(sample.sumRange(0, 2));

	}

}
