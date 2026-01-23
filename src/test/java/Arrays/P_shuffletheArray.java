package Arrays;

public class P_shuffletheArray {
	public int[] shuffle(int[] nums, int n) {

		int[] Result = new int[nums.length];
		int i = 0, j = 0, len = (n * 2) - 1;
		while (i < len) {
			Result[i++] = nums[j];
			Result[i++] = nums[j+n]; //i += 2;
			j++;

		}
		return Result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_shuffletheArray p = new P_shuffletheArray();

		int[] nums = { 2, 5, 1, 3, 4, 7 };
		System.out.println(p.shuffle(nums, 3));
	}

}
