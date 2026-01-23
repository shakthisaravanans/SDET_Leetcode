package Strings;

public class P_3136_Valid_Word {

	public boolean isValid(String word) {

		if (word.length() < 3 || word.matches(".*[@#$].*")) {
			return false;
		}

		if (word.matches(".*[aeiouAEIOU].*") && word.matches(".*(?i)[b-df-hj-np-tv-z].*")) {
			return true;
		}
		// && word.matches(".*[0-9].*")
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3136_Valid_Word sample = new P_3136_Valid_Word();

		System.out.println(sample.isValid("IMG"));
	}

}
