package Maths;

import java.util.ArrayList;
import java.util.Arrays;

public class P_1922_Count_Good_num {

	public int countGoodNumbers(long n) {
		int l = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				l *= 5;
			} else {
				l *= 4;
			}
		}

		return l;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_1922_Count_Good_num s = new P_1922_Count_Good_num();
		System.out.println(s.countGoodNumbers(50));
	}

}
