package Strings;

public class P_1455_Check_prefix {
	
	 public int isPrefixOfWord(String sentence, String searchWord) {
	
		 
		 String[] sent =  sentence.split(" ");
		 for (int i = 0; i < sent.length; i++) {			 
			 if(sent[i].indexOf(searchWord)==0)
			 {
				 return i+1;
			 }
			 
		}
		 
		 return -1;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1455_Check_prefix sample = new P_1455_Check_prefix();
		
		String Sentence = "this iproblem is an easy problem";
		
		System.out.println(sample.isPrefixOfWord(Sentence, "pro"));
		
	}

}
