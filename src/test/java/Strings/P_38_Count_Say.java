package Strings;

public class P_38_Count_Say {

	public String countAndSay1(int n) {

		String res = "1";
		for (int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int l = 0;
			while (l < res.length()) {
				int r = l;

				while (r < res.length() && res.charAt(r) == res.charAt(l)) {
					r++;
				}

				int count = r - l;

				sb.append(count).append(res.charAt(l));
				l=r;
			}
			res=sb.toString();
		}

		return res;


	}

	public String countAndSay(int n) {

		StringBuilder res = new StringBuilder("1");
		for (int i = 1; i < n; i++) {

			res = helper(res);
		}

		return res.toString();

	}

	public StringBuilder helper1(StringBuilder s) {

		int l = 0;
		StringBuilder sb = new StringBuilder();

		while (l < s.length()) {
			int r = l;

			while (r < s.length() && s.charAt(r) == s.charAt(l)) {
				r++;
			}
			int count = r - l;
			sb.append(count).append(s.charAt(l));
			l = r;
		}

		return sb;
	}
	
	
	public StringBuilder helper(StringBuilder s) {
		int count =1;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}else {
			sb.append(count).append(s.charAt(i-1));
			count=1;
			}
		}
		
		sb.append(count).append(s.charAt(s.length()-1));
		
		return sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_38_Count_Say s = new P_38_Count_Say();

		System.out.println(s.countAndSay(4));
	}

}
