package TwoPointer;

import java.util.Arrays;

public class P821_Shortest_Distance_to_a_Character {

	public int[] shortestToChar(String s, char c) {

		/*
		 * Step 1: prefix sum approach take length of sting and create leftarray and
		 * RightArray traverse to it and check if it is equal to char Step 2 :if yes put
		 * 0 and next will be leftcount ++ same for right also Step 3 atlast take short
		 * array and take min of two arrays.
		 */

		int[] leftarrays = new int[s.length()];
		int leftcount = -1;
		int[] Rightarrays = new int[s.length()];
		int[] Shortarrays = new int[s.length()];
		int Rightcount = -1;

		for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {

			if (s.charAt(i) == c) {
				leftarrays[i] = 0;
				leftcount = 0;
			} else {
				if (leftcount != -1) {
					leftcount++;
					leftarrays[i] = leftcount;
				} else {
					leftarrays[i] = s.length() - i;
				}

			}

			if (s.charAt(j) == c) {
				Rightarrays[j] = 0;
				Rightcount = 0;
			} else {
				if (Rightcount != -1) {
					Rightcount++;
					Rightarrays[j] = Rightcount;
				} else {
					Rightarrays[j] = j;
				}

			}

		}

		for (int k = 0; k < s.length(); k++) {
			Shortarrays[k] = Math.min(leftarrays[k], Rightarrays[k]);
		}

		return Shortarrays;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P821_Shortest_Distance_to_a_Character s = new P821_Shortest_Distance_to_a_Character();

		System.out.println(Arrays.toString(s.shortestToChar("loveleetcode", 'e')));

	}

}
