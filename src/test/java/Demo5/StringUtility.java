package Demo5;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtility {

	public String reverseString3(String str) {

		StringBuilder results = new StringBuilder();

		StringBuilder resultss = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c == ' ') {
				continue;
			}

			results.append(c);
		}

		results.reverse(); /// jih gf edcba

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				resultss.append(' ').append(results.charAt(count));
				i++;

			} else {
				resultss.append(results.charAt(count));
			}

			count++;
		}

		return resultss.toString();

	}

	public String reverseString(String str) {

		StringBuilder results = new StringBuilder();

		// ABC EF GHIJ

		// JIH GF ECBA

		char[] result = new char[str.length()];

		Arrays.fill(result, '0');

		/*
		 * for(char c : str.toCharArray()) { if(c==' ') {
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }
		 */

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result[i] = ' ';
			}

		}

		int j = str.length() - 1;
		int Count = str.length();
		while (j >= 0) {
			Count--;
			if (str.charAt(j) == ' ') {
				j--;
				continue;
			}

			if (result[j - Count] != ' ') {
				results.append(str.charAt(j));
			} else {
				results.append(' ').append(str.charAt(j));
				j--;
			}

			j--;
		}

		return results.toString();

	}

	public void drawpatten(int s) {

		if (s <= 3) {
			System.err.println("values is less than 3 or equal to 3 ");
		}

		if (s % 2 == 0) {
			System.err.println("Please provide odd nuber");

		} else {

			int l = s / 2 + 1, r = s / 2 + 1;
			for (int i = 0; i < s; i++) {

				for (int j = 0; j < s; j++) {
					if (j >= l && j <= r) {

						System.out.print("* ");

					} else {
						System.out.print(" ");
					}

				}
				l--;
				r++;

				System.out.println();
			}

		}

		// *
		// **
		/// ***

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC EF GHIJ";
		StringUtility util = new StringUtility();

		// Input: a = "11", b = "1"
		// Output: "100"

		// a.length,b.length;add=0

		String s = "hello";

		int Output = 0;

		for (int i = 1; i < s.length(); i++) {
			int temp = (s.charAt(i - 1) - s.charAt(i));

			// Integer.
			Output += Math.abs(temp);
		}

		// String revStr = util.reverseString3(str);
		// System.out.println(revStr);

		util.drawpatten(7);
		// Expected output of revStr is "JIH GF ECBA

		// JIHG FE CBA

	}

}
