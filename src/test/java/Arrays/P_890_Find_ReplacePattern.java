package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P_890_Find_ReplacePattern {

	public List<String> findAndReplacePattern(String[] words, String pattern) {

		ArrayList<String> l1 = new ArrayList<String>();

		outer: for (String s : words) {

			if (s.length() != pattern.length()) {
				continue;
			}

			HashMap<Character, Character> map = new HashMap<Character, Character>();

			for (int i = 0; i < s.length(); i++) {
				if (!map.containsKey(pattern.charAt(i))) {
					if (map.containsValue(s.charAt(i))) {
						continue outer;
					}

					map.put(pattern.charAt(i), s.charAt(i));

				} else {
					if (!map.get(pattern.charAt(i)).equals(s.charAt(i))) {
						continue outer;
					}
				}

			}
			l1.add(s);

		}

		return l1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_890_Find_ReplacePattern sample = new P_890_Find_ReplacePattern();
		String[] words = { "abc0", "deq", "mee", "aqq", "dkd", "ccc" };
		System.out.println(sample.findAndReplacePattern(words, "abb"));

	}

}
