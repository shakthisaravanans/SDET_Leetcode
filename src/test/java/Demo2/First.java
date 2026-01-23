package Demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class First {

	public void printval(String s) {
		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' | s.charAt(i) == 'e' | s.charAt(i) == 'i' | s.charAt(i) == 'o'
					| s.charAt(i) == 'u') {
				maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
			}
		}
		System.out.println(maps);

	}

	public void countval(String sss) {
		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();

		for (int i = 0; i < sss.length(); i++) {
			maps.put(sss.charAt(i),maps.getOrDefault(sss.charAt(i),0)+1);
		}

		System.out.println(maps);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First s1 = new First();
		String ss = "altimetrik";

		s1.printval(ss);
		
		s1.countval(ss);

//				vowels={'a','e','i','o','u'}
//				# a=1, e=1, i=2
	}

}
