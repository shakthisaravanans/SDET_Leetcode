package Strings;

import java.util.HashMap;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "big black bug bit a big black dog on his big black nose";

		String[] stringarray = string.split(" ");
		HashMap<String, Integer> maps = new HashMap<String, Integer>();

		for (int i = 0; i < stringarray.length; i++) {
			maps.put(stringarray[i],maps.getOrDefault(stringarray[i], 0)+1);
		}

		System.out.println(maps);
		
		for (String s : maps.keySet()) {
			if(maps.get(s)>1)
			{
				System.out.println(s);
			}
			
		}
	}

}
