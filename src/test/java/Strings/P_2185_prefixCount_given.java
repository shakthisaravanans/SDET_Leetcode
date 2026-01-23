package Strings;

public class P_2185_prefixCount_given {
	
public int prefixCount(String[] words, String pref) {
	
	
	/*
	 * Step 1 : loop till end of words
	 * 
	 * Step 2 : check temp.substring contain pref
	 * and count them.
	 */
	
	int Count=0;
	
	for (String Temp : words) {
		//if(Temp.length()>=pref.length() && Temp.substring(0,pref.length()).contentEquals(pref))
		if(Temp.indexOf(pref)==0)
		{
			Count++;
		}
	}
	
	return Count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P_2185_prefixCount_given sample = new P_2185_prefixCount_given();
		String [] words = {"pay","attention","practice","attend"};
		
		System.out.println(sample.prefixCount(words,"at"));

	}

}
