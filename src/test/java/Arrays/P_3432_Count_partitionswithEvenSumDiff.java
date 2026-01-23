package Arrays;

public class P_3432_Count_partitionswithEvenSumDiff {

	public int countPartitions(int[] nums) {

		int[] temp = nums.clone();
		int result=0,sumnum=0;

		for (int i = temp.length - 1; i > 1; i--) {
			temp[i - 1] = temp[i] + temp[i - 1];
		}

		for (int i = 1; i < nums.length; i++) {
			sumnum+=nums[i-1];
			if (Math.abs((sumnum - temp[i])) % 2 == 0) {
				result++;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3432_Count_partitionswithEvenSumDiff sample = new P_3432_Count_partitionswithEvenSumDiff();
		int nums[] = { 10, 10, 3, 7, 6 };
		System.out.println(sample.countPartitions(nums));
	}

}
