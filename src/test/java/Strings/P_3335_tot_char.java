package Strings;

public class P_3335_tot_char {

	public int lengthAfterTransformations(String s, int t) {

		StringBuilder mains = new StringBuilder(s);
		int i = 0;

		while (i < t) {
			StringBuilder temps = new StringBuilder();

			for (int j = 0; j < mains.length(); j++) {
				int chartemp = mains.charAt(j) + 1;
				if (chartemp == 123) {
					temps.append("ab");
				} else {
					temps.append((char) (chartemp));
				}

			}
			
			mains=temps;
			i++;
		}

		return mains.length();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_3335_tot_char same = new P_3335_tot_char();

		String s1 = "abcyy";
		int t = 2;


		System.out.println(same.lengthAfterTransformations(s1, t));

	}

}
