package Arrays;

public class P_942_DI_StringMatch {

	public int[] diStringMatch(String s) {
	
		int Len = s.length();
		int[] result = new int[Len+1];
		int count =0,L=0,R=Len;
		for(char c:s.toCharArray())
		{
			if(c=='I') {
					result[count++]= L++;
		}else {result[count++]= R--;}
		
		
		}
		
		if(s.charAt(Len-1)=='I') {result[count++]=L++;}else {result[count++]=R--;}
	
		return result;
    
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_942_DI_StringMatch sample = new P_942_DI_StringMatch();

		System.out.println(sample.diStringMatch("IDID"));
	}

}
