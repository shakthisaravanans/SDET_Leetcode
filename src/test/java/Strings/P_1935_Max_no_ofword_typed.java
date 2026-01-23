package Strings;

public class P_1935_Max_no_ofword_typed {
	public int canBeTypedWords(String text, String brokenLetters) {
		int Maxword = 0;
		// boolean cantype;

		String[] Splittext = text.split(" ");

		outer: for (String Temp : Splittext) {
			// cantype = true;
			for (char TempC : brokenLetters.toCharArray()) {

				if (Temp.indexOf(TempC) != -1) {
					// cantype = false;
					continue outer;

				}

			}

			Maxword++;

		}

		return Maxword;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1935_Max_no_ofword_typed sample = new P_1935_Max_no_ofword_typed();
		System.out.println(sample.canBeTypedWords("hello world", "ad"));
	}

}
