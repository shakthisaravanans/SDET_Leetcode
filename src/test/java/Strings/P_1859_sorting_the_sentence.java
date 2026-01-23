package Strings;

import java.util.HashMap;

public class P_1859_sorting_the_sentence {
	
public String sortSentence(String s) {
	
	String[] Sortstring = s.split(" ");
	StringBuilder result = new StringBuilder();
	
	HashMap<Integer,String> maps = new HashMap<Integer, String>();
	
	for(String temp : Sortstring)
	{
		maps.put(Integer.valueOf(temp.charAt(temp.length()-1)-48),temp.substring(0,temp.length()-1));
	}
	
	for (int i = 1; i <=maps.size(); i++) {
		result.append(maps.get(i)).append(" ");
	}
	
	return result.toString().trim();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1859_sorting_the_sentence sample = new P_1859_sorting_the_sentence();
		String s = "is2 sentence4 This1 a3";
		
		System.out.println(sample.sortSentence(s));
	}

}
