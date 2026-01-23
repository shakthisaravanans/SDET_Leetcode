package Strings;

import java.util.HashSet;
import java.util.Set;

public class P_3760_MaximumSubstringwith {
	 public int maxDistinct1(String s) {
		
		 Set<Character> sets = new HashSet<Character>();
		 
		 for(char s1 :s.toCharArray())
		 {
			 sets.add(s1);
		 }
		 
		 
		 return sets.size();
	        
	    }
	 
	 public int maxDistinct(String s) {
			
		
		 
		 return (int)s.chars().distinct().count();
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3760_MaximumSubstringwith sample = new P_3760_MaximumSubstringwith();
		System.out.println(sample.maxDistinct("abcd"));
	}

}
