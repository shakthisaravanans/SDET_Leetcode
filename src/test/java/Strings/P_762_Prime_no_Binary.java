package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class P_762_Prime_no_Binary {

	public int countPrimeSetBits(int left, int right) {

		ArrayList l1 = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
		int Results = 0;
		for (int i = left; i <= right; i++) {
			String binaryString = Integer.toBinaryString(i);
			int count = 0;
			for (char j : binaryString.toCharArray()) {

				if (j == '1') {
					count++;
				}
			}

			if (l1.contains(count)) {
				Results++;
			}

		}

		return Results;

	}

	public static void main(String[] args) {

		P_762_Prime_no_Binary sample = new P_762_Prime_no_Binary();

		System.out.println(sample.countPrimeSetBits(6, 10));
		// TODO Auto-generated method stub

	}

}
