package Strings;

import java.util.HashMap;

public class P_3442_Max_Even_Odd {

	public int maxDifference(String s) {

		/*
		 * 
		 * 
		 * we need to take map
		 * 
		 * here odd should be high
		 * 
		 * and even shoule bve low
		 * 
		 * max = highodd and lowevn
		 * 
		 * Hashmap maps = new hashmap(Character,Integer);
		 * 
		 * highODD =0
		 * 
		 * lowodd = Integer.maxvale();
		 * 
		 * 
		 * for( char nooffeq : s.tochararray) {maps.add(noodfeq,maps.getdefault( }
		 * 
		 * 
		 * 
		 * 
		 */

		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();

		int highodd = 0, loweven = Integer.MAX_VALUE;

		for (char letter : s.toCharArray()) {

			maps.put(letter, maps.getOrDefault(letter, 0) + 1);
		}

		for (int find : maps.values()) {
			/*
			 * 
			 * if (find % 2 != 0) { highodd=Math.max(highodd, find);
			 * 
			 * // if (highodd < find) { // highodd = find; // }
			 * 
			 * } else {
			 * 
			 * loweven=Math.min(loweven, find); // if (loweven > find) { // loweven = find;
			 * // }
			 * 
			 * }
			 * 
			 */
			
//		
//		find%2!=0?highodd=Math.max(highodd, find):loweven=Math.min(loweven, find);
//		
		
		}

		return highodd - loweven;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_3442_Max_Even_Odd max = new P_3442_Max_Even_Odd();
		System.out.println(max.maxDifference("abcabcab"));
	}

}
