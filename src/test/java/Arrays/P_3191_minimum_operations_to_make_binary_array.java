package Arrays;

public class P_3191_minimum_operations_to_make_binary_array {

	public int minOperations(int[] nums) {

		int minop = 0, len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] == 0) {
				nums[i] ^= 1;
				nums[i + 1] ^= 1;
				nums[i + 2] ^= 1;
				minop++;
			}
		}
		return ((nums[len - 2] == 0) || (nums[len - 1] == 0)) ? -1:minop;

	}
	
	
//	if ((nums[len - 2] == 0) || (nums[len - 1] == 0)) {
//	return -1;
//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3191_minimum_operations_to_make_binary_array s = new P_3191_minimum_operations_to_make_binary_array();

		int[] nums = { 0, 1, 1, 1 };

		System.out.println(s.minOperations(nums));
//		011100
//		100100 1
//		111000 2
//		111111 3

	}

}
