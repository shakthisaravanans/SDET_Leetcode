package Strings;

import java.util.TreeMap;

public class P_2264_Lar_3digit {

	public String largestGoodInteger1(String num) {

		TreeMap<Character, Integer> maps = new TreeMap<Character, Integer>();

		for (int i = 0; i < num.length() - 2; i++) {
			if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {

				maps.put(num.charAt(i), 1);

			}

		}

		if (!maps.isEmpty()) {

			StringBuilder s1 = new StringBuilder();
			s1.append(maps.lastKey()).append(maps.lastKey()).append(maps.lastKey());

			return s1.toString();
		}

		return "";

	}

	public String largestGoodInteger(String num) {
		char maxchar = 0;
		for (int i = 0; i < num.length() - 2; i++) {
			char temp = num.charAt(i);
			if (temp == num.charAt(i + 1) && temp == num.charAt(i + 2)) {
				if (maxchar < temp) {
					maxchar = temp;
				}
			}
		}
		return (maxchar == 0) ? "" : String.valueOf(maxchar).repeat(3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2264_Lar_3digit sample = new P_2264_Lar_3digit();
		System.out.println(sample.largestGoodInteger("3200014888"));
	}

}
