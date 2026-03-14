package Strings;

import java.util.HashMap;

public class P_1461_Check_String_Binary {
	
public boolean hasAllCodes(String s, int k) {

	
	int binarycode = (int)Math.pow(2, k);
	HashMap<String,Integer> maps = new HashMap<String, Integer>();
	
	for(int i=0;i<=s.length()-k;i++)
	{
		maps.put(s.substring(i,i+k),1);
	}
		
	
	return maps.size()==binarycode;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1461_Check_String_Binary sample = new P_1461_Check_String_Binary();
		System.out.println(sample.hasAllCodes("00110",2));
	}

}
