package Strings;

public class P_520_Detect_Capital {

	public boolean detectCapitalUse(String word) {

		boolean F_char = word.charAt(0) < 96 ? true : false;
		boolean Ucase = false, Lcase = false;

		for (int i = 1; i < word.length(); i++) {
			if (word.charAt(i) < 96) {
				Ucase = true;
			} else {
				Lcase = true;
			}

			if (Ucase == Lcase) {
				return false;
			}

		}

		if (!Lcase && !F_char) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_520_Detect_Capital sample = new P_520_Detect_Capital();

		String n = "32";
		int Count = 0;
		/*
		 * for (char s : n.toCharArray()) { Count = Math.max(Count, s - '0');
		 * 
		 * }
		 */
		int len = n.length() - 1;
		while (len >=0 && Count < 9) {
			Count = Math.max(Count, n.charAt(len--) - '0');

		}

		System.out.println(sample.detectCapitalUse("mL"));
	}

}
