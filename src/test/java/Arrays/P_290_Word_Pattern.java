package Arrays;

import java.util.HashMap;

public class P_290_Word_Pattern {

	public boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> maps = new HashMap<Character, String>();

		String[] temp = s.split(" ");

		int tempLen = temp.length, patternLen = pattern.length();

		if (tempLen != patternLen) {
			return false;
		}

		for (int i = 0; i < temp.length; i++) {

			char T = pattern.charAt(i);
			String ST = temp[i];
			if (!maps.containsKey(T)) {
				if (maps.containsValue(ST)) {
					return false;
				}
				maps.put(T, ST);

			} else {
				if (!maps.get(T).equals(ST)) {
					return false;
				}
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_290_Word_Pattern sample = new P_290_Word_Pattern();
		String pattern = "abba";
		String s = "dog dog dog dog";
		System.out.println(sample.wordPattern(pattern, s));
	}

}
