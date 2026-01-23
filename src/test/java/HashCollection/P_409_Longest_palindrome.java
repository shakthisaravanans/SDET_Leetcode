package HashCollection;

import java.util.HashMap;

public class P_409_Longest_palindrome {

	public int longestPalindrome(String s) {

		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();

		for (char i : s.toCharArray()) {
			maps.put(i, maps.getOrDefault(i, 0) + 1);
		}

		int Maxresults = 0;
		boolean odd = false;
		for (int j : maps.values()) {

			if (j % 2 == 0) {
				Maxresults += j;
			} else {
				Maxresults += j - 1;
				odd = true;
			}
		}
		return odd ? ++Maxresults : Maxresults;

	}

	public static void main(String[] args) {
		P_409_Longest_palindrome sample = new P_409_Longest_palindrome();
		String s = "ccc";
		System.out.println(sample.longestPalindrome(s));
		// TODO Auto-generated method stub

	}

}
