package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_Vowels_String {

	public String reverseVowels(String s) {

		int l = 0, r = s.length() - 1;
		StringBuilder nm = new StringBuilder(s);
		ArrayList<Character> lists = new ArrayList<Character>();
		lists.addAll(Arrays.asList('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));
		while (l < r) {

			if (lists.contains(s.charAt(r)) & lists.contains(s.charAt(l))) {
				char c = s.charAt(l);
				nm.setCharAt(l, nm.charAt(r));
				nm.setCharAt(r, c);
				l++;
				r--;

			} else {
				if (!lists.contains(s.charAt(l))) {
					l++;
				}
				// if (!lists.contains(s.charAt(r)))
				else {
					r--;
				}
			}

		}

		return nm.toString();

	}

	public String reverseVowels1(String s) {
		
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_Vowels_String s = new Reverse_Vowels_String();
		System.out.println(s.reverseVowels("leetcode"));

		Reverse_Vowels_String s1 = new Reverse_Vowels_String();
		System.out.println(s1.reverseVowels1("leetcode"));
	}

}
