package Arrays;

public class P_2210_Count_Hill_Vallay {

	public int countHillValley(int[] nums) {

		int currenti = 1, sum = 0;

		while (currenti < nums.length - 1)

		{
			int currentivall = nums[currenti];
			int leftval = 0;
			for (int left = currenti; left >= 0; left--) {
				if (nums[left] != currentivall) {
					leftval = nums[left];
					break;
				}

			}
			int Rightval = 0;

			int Right = currenti;
			while (Right < nums.length) {
				if (nums[Right] != currentivall) {
					Rightval = nums[Right];
					break;
				}

				Right++;
			}
			currenti = Right;

			if (leftval != 0 && Rightval != 0) {
				if ((Rightval > currentivall && leftval > currentivall)
						|| (Rightval < currentivall && leftval < currentivall)) {
					sum++;
				}

			}

		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2210_Count_Hill_Vallay sample = new P_2210_Count_Hill_Vallay();
		int[] nums = {6,6,5,5,4,1};

		System.out.println(sample.countHillValley(nums));
	}

}
