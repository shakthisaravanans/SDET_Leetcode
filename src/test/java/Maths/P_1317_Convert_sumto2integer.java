package Maths;

import java.util.Arrays;

public class P_1317_Convert_sumto2integer {

	public boolean check_non_zero(int k, int m) {

		while (k > 1) {

			if (k % 10 == 0) {
				return false;
			}
			k = k / 10;

		}

		while (m > 1) {
			if (m % 10 == 0) {
				return false;
			}
			m = m / 10;

		}

		return true;

	}

	public int[] getNoZeroIntegers(int n) {

		for (int i = 1; i < n; i++) {

			if (check_non_zero(i, n - i)) {

				return new int[] { i, n - i };
			}

		}

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1317_Convert_sumto2integer sample = new P_1317_Convert_sumto2integer();
		System.out.println(sample.getNoZeroIntegers(9));

	}

}
