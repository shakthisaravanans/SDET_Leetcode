package Strings;

public class P_917_Reverse_only_Letter {

	

	public String reverseOnlyLetters(String s) {

		int j = s.length()-1;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int s1 = s.charAt(i);
			if ((s1 >= 65 && s1 <= 90) || (s1 >= 97 && s1 <= 122)) {

				while (j >= 0) {
					int s2 = s.charAt(j);
					if ((s2 >= 65 && s2 <= 90) || (s2 >= 97 && s2 <= 122)) {
						result.append(s.charAt(j));
						j--;
						break;
					}
					j--;
				}

			} else {
				result.append(s.charAt(i));
			}

		}

		return result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_917_Reverse_only_Letter sample = new P_917_Reverse_only_Letter();
		
		System.out.println(sample.reverseOnlyLetters("a-bC-dEf-ghIj"));
	}

}
