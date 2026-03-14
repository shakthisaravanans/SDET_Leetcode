package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class P_884_UnCommon_words {
	public String[] uncommonFromSentences(String s1, String s2) {
		String[] s1part = s1.split(" ");
		String[] s2part = s2.split(" ");
		HashMap<String, Integer> Mapsr = new HashMap<String, Integer>();

		for (String s : s1part) {
			Mapsr.put(s, Mapsr.getOrDefault(s, 0) + 1);
		}

		for (String s : s2part) {
			Mapsr.put(s, Mapsr.getOrDefault(s, 0) + 1);
		}
		ArrayList<String> l1 = new ArrayList<String>();
		for (String s : Mapsr.keySet()) {
			if (Mapsr.get(s) == 1) {
				l1.add(s);
			}

		}

		return (String[]) l1.toArray(new String[0]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_884_UnCommon_words sample = new P_884_UnCommon_words();
		System.out.println(sample.uncommonFromSentences("apple apple", "banana"));
	}

}
