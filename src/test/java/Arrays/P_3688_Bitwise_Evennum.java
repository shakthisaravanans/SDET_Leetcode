package Arrays;

public class P_3688_Bitwise_Evennum {

	public int evenNumberBitwiseORs(int[] nums) {

		int results = 0;

		for (int i : nums) {

			if (i % 2 == 0) {
				results |= i;
			}
		}
		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3688_Bitwise_Evennum sample = new P_3688_Bitwise_Evennum();

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		System.out.println(sample.evenNumberBitwiseORs(nums));
	}

}
