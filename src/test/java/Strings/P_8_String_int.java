package Strings;

public class P_8_String_int {

	public int myAtoi(String s) {

		StringBuilder s2 = new StringBuilder();
		s=s.trim();
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {

				s2.append(s.charAt(i));
			}

			else if (s.charAt(i) == ' ') {
				continue;
			} else if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
				s2.append(s.charAt(i));
			} else if(s2.isEmpty()) {
				return 0;
			}else {
				Integer.parseInt(s2.toString());
				break;
			}

		}

		return (int) Long.parseLong(s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_8_String_int sample = new P_8_String_int();
		String s = "-91283472332";
		
		System.out.println(Long.parseLong(s));
		System.out.println(sample.myAtoi(s));
	}

}
