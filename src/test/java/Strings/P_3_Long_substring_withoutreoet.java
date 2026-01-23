package Strings;

import java.util.HashSet;
import java.util.Set;

public class P_3_Long_substring_withoutreoet {

	public int lengthOfLongestSubstring(String s) {

		//Set<Character> Sets = new HashSet<Character>();

		int len = s.length();
		int maxLength = 0;

		for (int i = 0; i < len; i++) {

			Set<Character> Sets = new HashSet<Character>();

			for (int j = i; j < len; j++) {

				if (!Sets.add(s.charAt(j))) {
					break;

				}

			}
			
			maxLength = Math.max(maxLength,Sets.size());

		}

		return maxLength;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3_Long_substring_withoutreoet sample = new P_3_Long_substring_withoutreoet();

		System.out.println(sample.lengthOfLongestSubstring("pwwkew"));
	}

}
