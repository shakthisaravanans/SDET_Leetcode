package Strings;

public class P_2108_Find_first_palindromic {

	public String firstPalindrome(String[] words) {

		for (String sample : words) {

			StringBuilder temp = new StringBuilder(sample);
			StringBuilder temps = new StringBuilder(sample);
			
			if (temp==(temps.reverse())) {
				return sample;
			}

		}

		return "";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2108_Find_first_palindromic test = new P_2108_Find_first_palindromic();

		String[] ss = { "abc", "car", "ada", "racecar", "cool" };

		System.out.println(test.firstPalindrome(ss));
	}

}
