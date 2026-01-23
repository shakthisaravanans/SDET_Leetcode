package Strings;

import java.util.HashMap;
import java.util.Map;

public class P_383_Ransom_note {

	public boolean canConstruct1(String ransomNote, String magazine) {
		return magazine.indexOf(ransomNote) != -1;

	}

	public boolean canConstruct(String ransomNote, String magazine) {

		Map<Character, Integer> magzmap = new HashMap<Character, Integer>();
		Map<Character, Integer> ranszmap = new HashMap<Character, Integer>();

		for (char Magz : magazine.toCharArray()) {
			magzmap.put(Magz, magzmap.getOrDefault(Magz, 0) + 1);
		}

		for (char ranz : ransomNote.toCharArray()) {

			ranszmap.put(ranz, ranszmap.getOrDefault(ranz, 0) + 1);

		}

		for (char i : ranszmap.keySet()) {

			if (magzmap.containsKey(i)) {

				if (magzmap.get(i) < ranszmap.get(i)) {
					return false;

				}
			} else {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_383_Ransom_note sample = new P_383_Ransom_note();
		System.out.println(sample.canConstruct("aa", "ab"));
	}

}
