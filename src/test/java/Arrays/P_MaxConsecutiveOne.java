package Arrays;

public class P_MaxConsecutiveOne {

	public int findMaxConsecutiveOnes1(int[] nums) {

		boolean flag = true;
		int max = 0, temp = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 1 && nums[i] == nums[i - 1]) {
				if (flag) {
					temp++;
				} else {
					max = Math.max(max, temp);
					temp = 0;
					flag = true;
				}
			} else {
				flag = false;
			}
		}

		return max;

	}

	public int findMaxConsecutiveOnes(int[] nums) {

		int max = 0, i = 0, j = 0;
		while (i < nums.length) {

			j = i;
			int temp = 0;
			while (j < nums.length && nums[i] == 1 && nums[i] == nums[j]) {
				j++;
				temp++;
			}
			max = Math.max(max, temp);
		if(temp!=0) {i = j;}else {i=j+1;}
		}

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_MaxConsecutiveOne sample = new P_MaxConsecutiveOne();
		int[] nums = { 1, 0, 1, 1, 0, 1 };
		System.out.println(sample.findMaxConsecutiveOnes(nums));
	}

}
