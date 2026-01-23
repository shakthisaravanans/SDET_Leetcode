package Arrays;

public class P_2016_Max_Diff {

	public int maximumDifference(int[] nums) {

		int Max = -1;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				Max = Math.max(Max, nums[j] - nums[i]);

			}
		}
		
		return (Max==0)?-1:Max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2016_Max_Diff sample = new P_2016_Max_Diff();

		int[] a = { 7, 1, 5, 4 };

		int[] b = { 9, 4, 3, 2 };
		System.out.println(sample.maximumDifference(b));
	}

}
