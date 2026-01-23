package Strings;

import java.util.HashMap;

public class P387_First_Unq {
	
	  public int firstUniqChar(String s) {
	
		  
		  HashMap<Character,Integer> Maps = new HashMap<Character, Integer>();
		  
		  for(char temp : s.toCharArray())
		  {
			  Maps.put(temp,Maps.getOrDefault(temp,0)+1);
		  }
		  
		  
		  for (int i = 0; i < s.length(); i++) {
			

			  if(Maps.get(s.charAt(i))==1) {
				  return i;
			  }
			  
		}
		  
		  return -1;
	        
	    }
	  
	  public int firstUniqChar1(String s) {
	
		
		  for (int i = 0; i < s.length(); i++) {
			  if(i==s.lastIndexOf(s.charAt(i)) && i == s.indexOf(s.charAt(i))) {
				  return i;
			  }
			  
		}
		  
		  return -1;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P387_First_Unq sample = new P387_First_Unq();
		
		System.out.println(sample.firstUniqChar1("loveleetcode"));
	}

}
