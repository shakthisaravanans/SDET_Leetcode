package Strings;

import java.text.ParseException;

public class freqAlphabets1309 {

	/*
	 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-
	 * mapping/
	 * 
	 * 
	 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
	 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
	 * 
	 * Input: s = "10#11#12" Output: "jkab" Explanation: "j" -> "10#" , "k" -> "11#"
	 * , "a" -> "1" , "b" -> "2".
	 * 
	 */

//	solution : 
//		1) travese from last to first 
//		2)If we see # then take 2digit from before and update iteration -2
//		3)Else take first value and give corresponding ascii values add to string uffer in first 
//

	public String freqAlphabets(String s) {

		int len = s.length() - 1;
		String temp = "";
		while (len >= 0) {
			if (s.charAt(len) == '#') {
				//int temps = Integer.parseInt(s.substring(len - 2, len)) + 96;
				temp = (char) (Integer.parseInt(s.substring(len - 2, len)) + 96) + temp;
				len = len - 3;
			} else {
				//int a = s.charAt(len) + 48;
				temp = (char) (s.charAt(len) + 48) + temp;
				len = len - 1;
			}

		}

		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqAlphabets1309 rome = new freqAlphabets1309();
		System.out.println(rome.freqAlphabets("10#11#12"));
	}

}
