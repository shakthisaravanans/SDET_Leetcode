package Demo_int;

public class second {

	public String prefixmethods(String[] arr) {

		String common = "";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i].charAt(count) != arr[j].charAt(count)) {
					return common;
				}

			}
			common = common + arr[i].charAt(count);
			count++;

		}

		return common;

	}

	public String prefixss(String[] s) {
		StringBuilder common = new StringBuilder();
		int countchar = 0, i = 0;
		while (i < s[0].length()) {
			for (int j = 1; j < s.length - 1; j++) {
				if (s[0].charAt(countchar) != s[j].charAt(countchar)) {
					return common.toString();
				}
				common.append(s[0].charAt(countchar));
				countchar++;
			}
		}

		return common.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "pretest", "pre", "pre" };
		second s = new second();

		System.out.println(s.prefixss(arr));

		// op =pr
	}

}
