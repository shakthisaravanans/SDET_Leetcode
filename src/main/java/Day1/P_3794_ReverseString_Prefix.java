package Day1;

public class P_3794_ReverseString_Prefix {

	public String reversePrefix(String s, int k) {

		StringBuilder result = new StringBuilder();

		return result.append(s.substring(0, k)).reverse().append(s.substring(k)).toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3794_ReverseString_Prefix sample = new P_3794_ReverseString_Prefix();
		System.out.println(sample.reversePrefix("abcd", 2));
	}

}
