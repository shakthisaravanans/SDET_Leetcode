package Strings;

public class P_459_Repeat_Sting {

	public boolean repeatedSubstringPattern1(String s) {

		if(s.length()<=1) {
			return false;
		}
		String temp = null ;
		for (int i = 1; i < s.length(); i++) {
			
			if(s.charAt(i)==s.charAt(0)) {
				temp=s.substring(0,i);
				break;
			}
		}
		
		for (int i = 0; i <s.length(); i+=temp.length()) {
			if(!s.substring(i,s.length()).contains(temp)) {
				return false;
			}
		}

		return true;

	}
	
	public boolean repeatedSubstringPattern(String s) {
		return (s+s).substring(1,(s.length()*2)-1).contains(s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_459_Repeat_Sting sample = new P_459_Repeat_Sting();

		System.out.println(sample.repeatedSubstringPattern("aa"));
	}

}
