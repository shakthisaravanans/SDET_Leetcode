package Strings;

public class P_541_Reverse_String2 {

	public String reverseStr(String s, int k) {

		int i = 0;
		StringBuilder result = new StringBuilder();
		while (i < s.length()) {

			
			int j = i,count=0;
			StringBuilder temp = new StringBuilder();
			while (j < s.length() && count < k) {
				temp.append(s.charAt(j));
				count++;
				j++;
			}
			temp.reverse();count = 0;
			while (j < s.length() && count<k) {
				temp.append(s.charAt(j));
				count++;
				j++;
			}
			result = result.append(temp);
			i = j;
		}

		return result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_541_Reverse_String2 sample = new P_541_Reverse_String2();

		System.out.println(sample.reverseStr("abcd", 2));

	}

}
