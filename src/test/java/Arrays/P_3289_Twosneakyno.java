package Arrays;

import java.util.HashSet;
import java.util.Set;

public class P_3289_Twosneakyno {

	public int[] getSneakyNumbers(int[] nums) {

		/*
		 * 1Set 2) single loop 3)flag if 2 found exit
		 *
		 */
		int[] result = new int[2];
		int count = 0;
		Set<Integer> sneakno = new HashSet<Integer>();

		for (int temp : nums) {
			if (!sneakno.add(temp)) {
				result[count++] = temp;
			}

			if (count > 1) {
				return result;
			}

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3289_Twosneakyno sample = new P_3289_Twosneakyno();

		int[] nums = { 0, 3, 2, 1, 3, 2 };
		System.out.println(sample.getSneakyNumbers(nums).toString());
	}

}
