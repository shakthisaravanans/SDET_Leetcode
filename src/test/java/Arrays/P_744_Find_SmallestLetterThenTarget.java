package Arrays;

public class P_744_Find_SmallestLetterThenTarget {
	
	   public char nextGreatestLetter(char[] letters, char target) {
	        
		   int[] lettersarry =  new int[26];
		   
		   
		   for(char s :letters)
		   {
			   int temp = s-97;
			   lettersarry[s-97]=1; 
		   }
		   
		   for(int i=target-96;i<lettersarry.length;i++)
		   {
			   if(lettersarry[i]==1)
			   {
				   return (char) (i+97);
			   }
		   }
		   
		   return letters[0];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_744_Find_SmallestLetterThenTarget sample = new P_744_Find_SmallestLetterThenTarget();
		
		
		int num =9;
		
	 String binaryString = Integer.toBinaryString(num);
	 
	 int int1 = Integer.parseInt(binaryString, 2);
	 
	 
		
		
		
		
		
		
		
		
		
		
		char[] letters = {'a','z','c'};
		
		System.out.println(sample.nextGreatestLetter(letters,'a'));
		
		
		
		
		
		
	}

}
