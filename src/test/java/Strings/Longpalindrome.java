package Strings;

public class Longpalindrome {

	public String longpalindrom(String str) {

		// can be done in sliding window concept
		//

		String resultpllindrom = "";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 2; j <=str.length(); j++) {
				temp=str.substring(i,j);
				
				StringBuilder temp1= new StringBuilder(temp).reverse();
				
				if(temp1.toString().equals(temp)&&resultpllindrom.length()<temp1.length())
				{
					resultpllindrom=temp;
				}
				

			}
		}

		return resultpllindrom;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Longpalindrome sample = new Longpalindrome();

		System.out.println(sample.longpalindrom("sannas"));
		/*
		 * Input: "hellosannasmith" Output: sannas
		 */
	}

}
