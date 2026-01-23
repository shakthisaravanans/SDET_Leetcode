package Demo5;

public class First {

	public String revesestring(String s) {

		StringBuilder rev = new StringBuilder();
		String[] s1 = s.split(" ");

		for (int i = s1.length - 1; i >= 0; i--) {
			String sss = s1[i]; // indianam
			StringBuilder revo = new StringBuilder();
			revo.append(sss).reverse();
			rev.append(revo);

		}

		System.out.println(rev);
		System.out.println(rev.length());

		if (rev.length() % 2 == 0) {
			System.out.println("First " + rev.charAt(0) + " MID : " + rev.charAt(rev.length() / 2) + 1 + " last:"
					+ rev.charAt(rev.length() - 1));

		} else {

			System.out.println("First: " + rev.charAt(0) + " Mid+1  " + rev.charAt(rev.length() / 2) + " last :"
					+ rev.charAt(rev.length() - 1));
		}

		// rev.append(revo).reverse();

		return s;

	}

	public String revsersestrings(String ss) {

		String[] splitsstring = ss.split(" ");
		StringBuilder r = new StringBuilder();

		for (int i = splitsstring.length-1; i >= 0; i--) {
			StringBuilder temps = new StringBuilder(splitsstring[i]);
			r.append(" " +temps.reverse());

		}

		return r.toString().trim();
	}

	public static void main(String[] args) {

		First mn = new First();
		System.out.println(mn.revesestring("I am an Indian"));

		System.out.println(mn.revsersestrings("I Love Roses"));
		// TODO Auto-generated method stub
		// i/p : I am an Indian

		// o/p naidnInamaI even { first mid+1 last)
		// odd(f mid last )

	}

}
