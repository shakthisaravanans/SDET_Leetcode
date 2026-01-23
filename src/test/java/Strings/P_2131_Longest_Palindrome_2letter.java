package Strings;

import java.util.HashMap;

public class P_2131_Longest_Palindrome_2letter {

	public int longestPalindrome1(String[] words) {

		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		int UniqpalindromString = 0, PairPalinString = 0;
		for (String Temp : words) {
			StringBuilder STemp = new StringBuilder(Temp);
			STemp = STemp.reverse();
			if (Temp.equals(STemp.toString())) {
				if (maps.containsKey(Temp)) {
					maps.remove(Temp);
					PairPalinString++;
					UniqpalindromString--;
				} else {
					maps.put(Temp, 1);
					UniqpalindromString++;
				}

			} else {
				if (maps.containsKey(STemp.toString())) {
					maps.remove(STemp.toString());
					PairPalinString++;

				} else {
					maps.put(Temp, 1);
				}

			}

		}

		return UniqpalindromString > 0 ? (PairPalinString * 4) + 2 : PairPalinString * 4;

	}

	public int longestPalindrome(String[] words) {

		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		int PairPalinString = 0, EvePalin = 0, OddPalin = 0;
		for (String Temp : words) {
			maps.put(Temp, maps.getOrDefault(Temp, 0) + 1);
		}

		for (String key : maps.keySet()) {
			String Rev = new StringBuilder(key).reverse().toString();

			if (key.equals(Rev)) {
				if (maps.get(key) % 2 == 0) {		
					EvePalin += maps.get(key);
				} else {
					EvePalin += maps.get(key)-1;
					OddPalin=1;

				}
			} else {

				if (maps.containsKey(Rev)) {
					PairPalinString += Math.min(maps.get(key), maps.get(Rev));
					maps.put(key, 0);
					maps.put(Rev, 0);
				}
			}
		}

		return (PairPalinString * 4) + (EvePalin + OddPalin) * 2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2131_Longest_Palindrome_2letter sample = new P_2131_Longest_Palindrome_2letter();

		String[] words = { "dd", "aa", "bb", "dd", "aa", "dd", "bb", "dd", "aa", "cc", "bb", "cc", "dd", "cc" };
		System.out.println(sample.longestPalindrome(words));
	}

}
