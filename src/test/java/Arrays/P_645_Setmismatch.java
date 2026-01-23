package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_645_Setmismatch {

	public int[] findErrorNums(int[] nums) {

		int len = nums.length;
		int fir = 0, sec = 0;
		int[] temp = new int[nums.length + 1];

		for (int i : nums) {
			temp[i]++;
		}
		for (int i = 1; i < len + 1; i++) {
			if (temp[i] == 0) {
				sec = i;
			}
			if (temp[i] == 2) {
				fir = i;
			}
			if (sec > 0 && fir > 0) {
				return new int[] { sec, fir };
			}
		}

		return nums;

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> al = new ArrayList<Integer>();
		int[] temp = new int[nums.length + 1];
		for (int i : nums) {
			temp[i] = 1;
		}

		for (int i = 1; i < nums.length + 1; i++) {
			if (temp[i] == 0) {
				al.add(i);
			}
		}

		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_645_Setmismatch sample = new P_645_Setmismatch();

		int[] nums = { 1, 2, 2, 4 };
		System.out.println(Arrays.toString(sample.findErrorNums(nums)));
	}

}
