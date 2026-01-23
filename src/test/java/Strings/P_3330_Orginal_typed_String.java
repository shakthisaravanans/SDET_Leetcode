package Strings;

import java.util.HashMap;

public class P_3330_Orginal_typed_String {

	public int possibleStringCount3(String word) {

		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();

		for (char i : word.toCharArray()) {
			maps.put(i, maps.getOrDefault(i, 0) + 1);
		}

		int Resultword = 0;
		for (int j : maps.values()) {

			Resultword += j - 1;

		}

		return Resultword + 1;

	}

	public int possibleStringCount1(String word) {

		int Resultword = 0;
		for (int i = 1; i < word.length(); i++) {

			if (word.charAt(i) == word.charAt(i - 1)) {
				Resultword++;
			}

		}

		return Resultword + 1;

	}
	
	
	public int possibleStringCount(String word,int k) {

		int Resultword = 0;
		for (int i = 1; i < word.length(); i++) {

			if (word.charAt(i) == word.charAt(i - 1) && word.length()-i >=k) {
				Resultword++;
			}

		}
		
		for (int i = word.length()-2; i >0; i--) {

			if (word.charAt(i) == word.charAt(i+1) && i+1>=k) {
				Resultword++;
			}

		}

		return Resultword;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3330_Orginal_typed_String Sample = new P_3330_Orginal_typed_String();

		String Word = "aaabbb";
		
		System.out.println(Sample.possibleStringCount(Word,3));
		
		//System.out.println(Sample.possibleStringCount1(Word));
	}

}
