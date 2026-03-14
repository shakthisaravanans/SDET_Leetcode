package Arrays;

import java.util.HashMap;

public class P3736_Min_Thr_III {
	
	  public int minMoves(int[] nums) {
	
		
		
		  
		  
		  
		  return nums[2]-(nums[0]+nums[1]);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 3, 4, 5, 1 };

		HashMap<Integer, Integer> Maps = new HashMap<Integer, Integer>();

		for (int i : a) {

			Maps.put(i, Maps.getOrDefault(i, 0) + 1);

		}
		
		
		
		for(int j :Maps.keySet())
		{
			if(Maps.get(j)>1)
			{
				System.out.println(j);
			}
		}
		
		System.out.println("--------------------------------------------");
		String s = "suuccesss";
		
		
		HashMap<Character, Integer> Word = new HashMap<Character, Integer>();
		

		for (char i : s.toCharArray()) {

			Word.put(i, Word.getOrDefault(i, 0) + 1);

		}
		
		System.out.println(Word);
		
	}

}
