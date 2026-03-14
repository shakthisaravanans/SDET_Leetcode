package Arrays;

public class P_1980_Find_unique_Bin_string {

	public String findDifferentBinaryString(String[] nums) {

		StringBuilder result = new StringBuilder();
		int len = nums.length;
		for (int i = 0; i < len; i++) {

			result.append(nums[i].charAt(i) == '0' ? '1' : '0');
		}

		return result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1980_Find_unique_Bin_string sample = new P_1980_Find_unique_Bin_string();

		String[] nums = { "111", "011", "001" };
		System.out.println(sample.findDifferentBinaryString(nums));
	}

}
