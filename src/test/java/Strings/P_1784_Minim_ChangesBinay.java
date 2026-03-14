package Strings;

public class P_1784_Minim_ChangesBinay {
	
	 public boolean checkOnesSegment(String s) {
		
		 if(s.charAt(0)=='0')
		 {
			 return false;
		 }
		 boolean Zerotemp = false;
		 for(int i=1;i<s.length();i++)
		 {
			 
			 if(Zerotemp && s.charAt(i)=='1')
			 {
				 return false;
			 }
			 
			 if(s.charAt(i)=='0')
			 {
				 Zerotemp = true;
			 }
		 }
		 
		 
		 
		 return true;
	        
	    }
	
	 
	 /// 10001

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1784_Minim_ChangesBinay sample = new P_1784_Minim_ChangesBinay();
		
		System.out.println(sample.checkOnesSegment("1100"));
		
	}

}
