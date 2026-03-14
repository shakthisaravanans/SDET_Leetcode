package Strings;

public class P_680_Palindrome11 {

	public boolean validPalindrome(String s) {

		int l = 0, r = s.length() - 1;
		// boolean first = false;
		while (l <= r) {
			if (s.charAt(l) != s.charAt(r)) {
				StringBuilder Rev1 = new StringBuilder(s.substring(l, r)).reverse();
				StringBuilder Rev2 = new StringBuilder(s.substring(l + 1, r + 1)).reverse();

				System.out.println(s.substring(l, r));
				System.out.println(s.substring(l + 1, r + 1));
				if (s.substring(l, r).equals(Rev1) || s.substring(l + 1, r + 1).equals(Rev2)) {
					return true;
				} else {
					return false;
				}

			}
			l++;
			r--;

		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_680_Palindrome11 sample = new P_680_Palindrome11();

		System.out.println(sample.validPalindrome("abca"));
	}

}
