package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_1408_String_matching {

	public List<String> stringMatching(String[] words) {

		List<String> li = new ArrayList<>();
		
		Arrays.sort(words);
		int Len = words.length;
		for (int i = 0; i < Len; i++) {

			for (int j = 0; j <Len; j++) {
				if (words[j].contains(words[i]) && j != i) {
					li.add(words[i]);
					break;
				}

			}
		}

		return li;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1408_String_matching sample = new P_1408_String_matching();
		String words[] = { "mass", "as", "hero", "superhero" };
		System.out.println(sample.stringMatching(words));
	}

}
