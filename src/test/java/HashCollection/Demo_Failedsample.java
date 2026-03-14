package HashCollection;

import java.util.HashMap;

public class Demo_Failedsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Saravanan";
		String s2 = "Manisharma";

		HashMap<Character,Integer> S1map = new HashMap<Character,Integer>();

		for(char s:s1.toCharArray())
		{
		S1map.put(s,1);
		}



		HashMap<Character,Integer> S2map = new HashMap<Character,Integer>();

		for(char s: s2.toCharArray())
		{
		S2map.put(s,1);
		}

		for(char i : S1map.keySet())
		{
		if(S2map.containsKey(i))
		{
		System.out.println(i);
		}
	}

}}
