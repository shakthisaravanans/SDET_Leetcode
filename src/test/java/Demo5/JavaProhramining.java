package Demo5;

public class JavaProhramining {

	public String prefixtest(String[] a) {

		int left = 0;

		StringBuilder s = new StringBuilder();

		while (left < a[0].length()) {

			for (int right = 1; right < a.length; right++) {
				if (a[0].charAt(left) != a[right].charAt(left)) {
					return s.toString();
				}
			}
			s.append(a[0].charAt(left));
			left++;
		}
		 return s.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaProhramining sss = new JavaProhramining();

		String[] aa = { "Pref", "Prefs", "Pre" };
		sss.prefixtest(aa);
	}

}
