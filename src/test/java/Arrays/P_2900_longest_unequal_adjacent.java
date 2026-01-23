package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P_2900_longest_unequal_adjacent {

	public List<String> getLongestSubsequence1(String[] words, int[] groups) {

		/*
		 * Simple solution only after seeiing youtube
		 * 
		 * Step1 : Declare list with string and lastword as which we passed. let put it
		 * as -1 becs (0,1) is involved in it
		 * 
		 * Step 2 : compare lastword to index and check it is not equal them add them in
		 * list
		 * 
		 * step 3 : return list
		 */

		List l1 = new ArrayList<String>();

		int len = words.length;
		int last = -1;
		for (int i = 0; i < len; i++)

			if (groups[i] != last) {
				last = groups[i];
				l1.add(words[i]);
			}
		return l1;

	}
	
	public List<String> getLongestSubsequence(String[] words, int[] groups) {
	    List<String> result = new ArrayList<>();

	    for (int i = 1; i < words.length; i++) {
	        if (groups[i - 1] != groups[i] &&
	            words[i - 1].length() == words[i].length() &&
	            hasHammingDistanceOne(words[i - 1], words[i])) {

	            result.add(words[i - 1]);
	            result.add(words[i]); // To include both words in the valid pair
	        }
	    }

	    return result;
	}

	public boolean hasHammingDistanceOne(String a, String b) {
	    int count = 0;
	    for (int i = 0; i < a.length(); i++) {
	        if (a.charAt(i) != b.charAt(i)) {
	            count++;
	            if (count >= 2) {
	                return false;
	            }
	        }
	    }
	    return count == 1;
	}


	public List<String> getLongestSubsequence2(String[] words, int[] groups) {

		/*
		 * Simple solution only after seeiing youtube
		 * 
		 * Step1 : Declare list with string and lastword as which we passed. let put it
		 * as -1 becs (0,1) is involved in it
		 * 
		 * Step 2 : compare lastword to index and check it is not equal them add them in
		 * list
		 * 
		 * step 3 : return list
		 */

		int len = words.length;
		List l1 = new ArrayList<String>();
		//l1.add(words[0]);

		for (int i = 1; i < len; i++) {
			if (groups[i - 1] != groups[i] && words[i - 1].length() == words[i].length()
					&& hammingsdis(words[i - 1], words[i])) {
				l1.add(words[i-1]);
			}

		}
		
		 if (groups[len-1] != groups[len-2] && words[len - 1].length() == words[len-2].length()
					&& hammingsdis(words[len - 1], words[len-2])) {
				l1.add(words[len-1]);
                 }
		return l1;

	}

	public boolean hammingsdis(String a, String b) {

		int count = 0;

		for (int j = 0; j < a.length(); j++) {
			if (a.charAt(j) != b.charAt(j)) {
				count++;
			}

			if (count >= 2) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nums01 = { "bab", "dab", "cab" }; // [0,1,2,4,5,3]
		int[] nums02 = { 1, 2, 2 }; // 23
		
		String[] nums03 = {"a","b","c","d"}; // [0,1,2,4,5,3]
		int[] nums04 = { 1, 2, 3,4 }; // 23
		
		
		P_2900_longest_unequal_adjacent s = new P_2900_longest_unequal_adjacent();
		System.out.println(s.getLongestSubsequence(nums01, nums02));
	}

}
