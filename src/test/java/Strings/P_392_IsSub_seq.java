package Strings;

public class P_392_IsSub_seq {

	public boolean isSubsequence1(String s, String t) {
		int S_Len = s.length(), T_Len = t.length(),current_Len =T_Len;
		int i = 0, templast = -1;
		while (i < S_Len) {

			
			if(templast+1>=T_Len) {
				return false;
				
			}
			
			int temp = t.substring(templast+1).indexOf(s.charAt(i));

			if (temp == -1) {
				return false;
			}

			templast+= temp+1;
			i++;

		}

		return true;

	}
	
	public boolean isSubsequence(String s, String t) {
		// two pointer apporach .
		int i =0,j=0,S_Len=s.length(),T_Len=t.length();
		while(i<S_Len && j<T_Len)
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
			}
			j++;
		}
	
		return i==S_Len;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_392_IsSub_seq sample = new P_392_IsSub_seq();
		System.out.println(sample.isSubsequence("aaaa", "bbaaaa"));
	}

}
