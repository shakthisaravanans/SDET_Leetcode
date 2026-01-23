package Strings;

public class P3541_FreqVowel_Cont {

	public int maxFreqSum(String s) {

		int count_vowel = 0, count_const = 0, len = s.length();
		char[] word = new char[26];
		for (int i = 0; i < len; i++) {
			char temp = s.charAt(i);
			word[temp - 'a']++;
			if ("aeiou".indexOf(temp) != -1)

			{
				count_vowel = Math.max(count_vowel, word[temp - 'a']);

			} else {
				count_const = Math.max(count_const, word[temp - 'a']);
			}

		}

		return count_vowel + count_const;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3541_FreqVowel_Cont sample = new P3541_FreqVowel_Cont();
		System.out.println(sample.maxFreqSum("successes"));
	}

}
