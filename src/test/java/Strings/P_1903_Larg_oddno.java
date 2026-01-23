package Strings;

public class P_1903_Larg_oddno {

	public String largestOddNumber(String num) {

		for (int i = num.length()-1; i >= 0; i--) {
				
			int temp = Character.getNumericValue(num.charAt(i));
			if(temp%2!=0)
			{
				return num.substring(0,i+1);
			}
			
		}

		return "";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1903_Larg_oddno sample = new P_1903_Larg_oddno();

		System.out.println(sample.largestOddNumber("002"));
	}

}
