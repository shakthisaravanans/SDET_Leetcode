package Strings;

import java.util.ArrayList;
import java.util.List;

public class P_500_Keyboard_Row {

	public String[] findWords(String[] words) {

	
		List<String> l1 = new ArrayList<String>();
		for (String s : words) {
			 if (s.length() <= 1) { // Single-letter or empty strings are valid
		            l1.add(s);
		            continue;
		        }
			 
			for (int j = 1; j < s.length(); j++) {

				String Firstval = getRow(s.charAt(j));
				String Secondval = getRow(s.charAt(j - 1));

				if (getRow(s.charAt(j)) != getRow(s.charAt(j - 1))) {
					break;
				}
				
				if(j==s.length()-1) {
				l1.add(s);}

			}
		//	l1.add(s);
			
			
		}
		
		//System.out.println(l1);

		return l1.toArray(new String[0]);

	}

	public String getRow(char c) {

		String First = "qwertyuiopQWERTYUIOP", Second = "asdfghjklASDFGHJKL";
		if (First.indexOf(c) != -1)
			return "First";
		if (Second.indexOf(c) != -1)
			return "Second";
		return "Third";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_500_Keyboard_Row sample = new P_500_Keyboard_Row();

		String[] words = { "Hello", "Alaska", "Dad", "Peace" };

		System.out.println(sample.findWords(words));
	}

}
