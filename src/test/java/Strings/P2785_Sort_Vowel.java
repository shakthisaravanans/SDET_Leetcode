package Strings;

import java.util.Arrays;

public class P2785_Sort_Vowel {

	public String sortVowels1(String s) {

		int Len = s.length(), countList = 0;

		StringBuilder Result = new StringBuilder();

		char[] vowellist = new char[Len];

		Arrays.fill(vowellist, '{');

		for (int i = 0; i < Len; i++) {
			char temp = s.charAt(i);
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U' || temp == 'a' || temp == 'e'
					|| temp == 'i' || temp == 'o' || temp == 'u') {
				vowellist[countList++] = temp;
			}

		}

		Arrays.sort(vowellist);

		System.out.println(vowellist);
		countList = 0;

		for (int i = 0; i < Len; i++) {
			char temp = s.charAt(i);
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U' || temp == 'a' || temp == 'e'
					|| temp == 'i' || temp == 'o' || temp == 'u') {
				Result.append(vowellist[countList++]);
			} else {
				Result.append(s.charAt(i));
			}

		}

		return Result.toString();

	}

	public String sortVowels(String s) {

		int Len = s.length(), countList = 0;

		StringBuilder Result = new StringBuilder();
		char[] vowellist = new char[Len];

		Arrays.fill(vowellist, '{');

		for (int i = 0; i < Len; i++) {
			char temp = s.charAt(i);
			if ("AEIOUaeiou".indexOf(temp) != -1) {
				vowellist[countList++] = temp;
			}

		}

		Arrays.sort(vowellist);

		
		countList = 0;

		for (int i = 0; i < Len; i++) {
			char temp = s.charAt(i);
			if("AEIOUaeiou".indexOf(temp) != -1){
				Result.append(vowellist[countList++]);
			} else {
				Result.append(s.charAt(i));
			}

		}

		return Result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2785_Sort_Vowel sample = new P2785_Sort_Vowel();
		System.out.println(sample.sortVowels("lEetcOde"));
	}

}
