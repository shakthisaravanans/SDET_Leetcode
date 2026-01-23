package Strings;

public class P_1790_Check_2string {

	public boolean areAlmostEqual1(String s1, String s2) {

		int[] S1 = new int[26];
		int[] S2 = new int[26];

		int S1len = s1.length();
		if (S1len != s2.length()) {
			return false;
		}

		for (int i = 0; i < S1len; i++) {
			S1[s1.charAt(i) - 97]++;
			S2[s2.charAt(i) - 97]++;
		}

		for (int j = 0; j < 26; j++) {
			if (S1[j] != S2[j]) {
				return false;
			}
		}

		return true;
	}

	public boolean areAlmostEqual(String s1, String s2) {
		int S1len = s1.length();
		if (S1len != s2.length()) {
			return false;
		}
		int count = 0;
		for (int i = 0; i < S1len; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				count++;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1790_Check_2string sample = new P_1790_Check_2string();

		System.out.println(sample.areAlmostEqual("band", "kanb"));

	}

}
