package Arrays;

public class P_3151_Special_Array {
	public boolean isArraySpecial(int[] nums) {

		int len = nums.length;

		for (int i = 1; i < len; i++) {
			if ((nums[i] % 2 == 0 && nums[i - 1] % 2 == 0) || (nums[i - 1] % 2 != 0 && nums[i] % 2 != 0)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3151_Special_Array sample = new P_3151_Special_Array();
		int[] nums = { 2 };
		System.out.println(sample.isArraySpecial(nums));
	}

}
