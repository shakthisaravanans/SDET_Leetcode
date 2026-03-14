package Arrays;

public class P_2574_Left_Right_Sum {

	public int[] leftRightDifference(int[] nums) {

		int Len = nums.length;// 4
		int[] left = new int[Len];
		int[] right = new int[Len];
		int[] Res = new int[Len];

		for (int i = 1; i < Len; i++) {
			left[i] = left[i - 1] + nums[i - 1];
			right[Len - i - 1] = right[Len - i] + nums[Len - i];
		}

		for (int i = 0; i < Len; i++) {
			Res[i] = Math.abs(left[i] - right[i]);
		}

		return Res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2574_Left_Right_Sum sample = new P_2574_Left_Right_Sum();
		int[] nums = { 0 };

		System.out.println(sample.leftRightDifference(nums));
	}

}
