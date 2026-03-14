package Strings;

import java.util.ArrayList;
import java.util.LinkedList;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.LinkedNode;

public class P_1758_Alt_Bit {

	public int minOperations1(String s) {

		int oflag = 0, Fflag = 0;

		char chng = 0;

		for (char j : s.toCharArray()) {

			System.out.println(j - '0');
			System.out.println(chng);
			if (j - '0' != chng) {
				oflag++;
			} else {
				Fflag++;
			}

			chng = (chng == '0') ? '1' : '0';
		}

		return Math.min(Fflag, oflag);

	}

	public int minOperations(String s) {

		int Zflag = 0, Oflag = 0;

		for (int i = 0; i < s.length(); i++) {

			char first0 = (i % 2 == 0) ? '0' : '1';
			char first1 = (i % 2 == 0) ? '1' : '0';

			if (first0 != s.charAt(i)) {
				Zflag++;
			}
			if (first1 != s.charAt(i)) {
				Oflag++;
			}
		}

		return Math.min(Zflag, Oflag);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1758_Alt_Bit sample = new P_1758_Alt_Bit();
		String s = "1111";

		System.out.println(sample.minOperations(s));

	}

}
