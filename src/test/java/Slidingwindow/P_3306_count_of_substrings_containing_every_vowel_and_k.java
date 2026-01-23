package Slidingwindow;

import java.util.HashMap;

public class P_3306_count_of_substrings_containing_every_vowel_and_k {

	public long countOfSubstrings(String word, int k) {

		int i = 0, count = 0;
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		hash.put('a', 0);
		hash.put('e', 0);
		hash.put('i', 0);
		hash.put('o', 0);
		hash.put('C', 0);
		hash.put('u', 0);

		for (int j = 0; j < word.length(); j++) {
			if (!hash.containsKey(word.charAt(j))) {
				hash.put('C', hash.get('C') + 1);
			} else {
				hash.put(word.charAt(j), hash.get(word.charAt(j)) + 1);

			}
			while (hash.get('a') > 0 & hash.get('e') > 0 & hash.get('i') > 0 & hash.get('o') > 0 & hash.get('u') > 0
					& hash.get('C') == k) {

				if (!hash.containsKey(word.charAt(i))) {
					hash.put('C', hash.get('C') - 1);
				} else {
					hash.put(word.charAt(i), hash.get(word.charAt(i)) - 1);
				}
				i++;
			}
			count = count + i;
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3306_count_of_substrings_containing_every_vowel_and_k s = new P_3306_count_of_substrings_containing_every_vowel_and_k();
		System.out.println(s.countOfSubstrings("ieaouqqieaouqq", 1));
	}

}
