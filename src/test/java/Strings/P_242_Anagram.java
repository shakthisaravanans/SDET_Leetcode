package Strings;

import java.util.HashMap;
import java.util.Map;

public class P_242_Anagram {
	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false; // quick check
		}

		Map<Character, Integer> Smap = new HashMap<>();
		Map<Character, Integer> Tmap = new HashMap<>();

		for (char sh : s.toCharArray()) {
			Smap.put(sh, Smap.getOrDefault(sh, 0) + 1);
		}

		for (char th : t.toCharArray()) {
			Tmap.put(th, Tmap.getOrDefault(th, 0) + 1);
		}

		if (Tmap.size() != Smap.size()) {
			return false;
		}

		for (char entry : Smap.keySet()) {
			if (!Tmap.containsKey(entry)) {
				return false;
			}
			if (!Tmap.get(entry).equals(Smap.get(entry))) { // use .equals()
				return false;
			}
		}

		return true;

	}

	public boolean isAnagram1(String s, String t) {

		if (s.length() != t.length()) {
			return false; // quick check
		}

		int[] S = new int[26];

		for (char c : s.toCharArray()) {

			S[c - 'a']++;

		}

		for (char c : t.toCharArray()) {

			S[c - 'a']--;

		}

		for (int i = 0; i < 26; i++) {
			if (S[i] != 0) {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_242_Anagram sample = new P_242_Anagram();
		System.out.println(sample.isAnagram1("anagram", "nagaram"));
	}

}
