package Strings;

import java.util.HashSet;
import java.util.Set;

public class P_804_Unique_morse {

	public int uniqueMorseRepresentations(String[] words) {

		String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		Set<String> uniquset = new HashSet<String>();

		for (String string : words) {
			StringBuilder temp = new StringBuilder();
			for (char chars : string.toCharArray()) {

				temp.append(Morse[chars - 'a']);

			}
			uniquset.add(temp.toString());
		}
		return uniquset.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_804_Unique_morse sample = new P_804_Unique_morse();

		String[] words = { "gin", "zen", "gig", "msg" };

		System.out.println(sample.uniqueMorseRepresentations(words));
	}

}
