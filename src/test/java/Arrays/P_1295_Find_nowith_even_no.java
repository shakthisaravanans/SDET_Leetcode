package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P_1295_Find_nowith_even_no {

	public int findNumbers1(int[] nums) {

		int count = 0;
		for (int i : nums) {

			// StringBuilder db = new StringBuilder();
			// db.append(i);
			if (String.valueOf(i).length() % 2 == 0) {
				count++;
			}

		}

		return count;

	}

	public int findNumbers(int[] nums) {

		int count = 0;
		for (int i : nums) {
			if ((i >= 10 && i <= 99) || (i >= 1000 && i <= 9999) || (i >= 100000 && i <= 999999)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 12, 345, 2, 6, 7896 };

		P_1295_Find_nowith_even_no s = new P_1295_Find_nowith_even_no();
		System.out.println(s.findNumbers(nums));
	}

}
