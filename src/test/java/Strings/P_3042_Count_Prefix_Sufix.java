package Strings;

public class P_3042_Count_Prefix_Sufix {
	
	 public int countPrefixSuffixPairs(String[] words) {
		 
		 int count =0;
		 
		 for(int i=0;i<words.length-1;i++)
			 for(int j=i+1;j<words.length;j++)
			 {
				 if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
				 {
					 count++;
				 }
			 }
		 
		
		 
		 return count;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3042_Count_Prefix_Sufix sample = new P_3042_Count_Prefix_Sufix();
		String [] words = {"a","aba","ababa","aa"};
		System.out.println(sample.countPrefixSuffixPairs(words));
		
	}

}
