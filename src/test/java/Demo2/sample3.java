package Demo2;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabcccaa";
		int Count = 1;

		StringBuilder result = new StringBuilder();
//		for (int i = 1; i < s.length(); i++) {
//		
//			if(s.charAt(i)==s.charAt(i-1))
//			{
//				Count++;
//				
//			} else {
//				result.append(s.charAt(i-1)).append(Count);
//				Count=1;
//			}
//		}
//		
//		result.append(s.charAt(s.length()-1)).append(Count);
//		
//		
//		System.out.println(result);
		
		for (String string : args) {
			
		}

		int l = 0, r = 0, count = 0;

		while (l < s.length()) {
			r = l;
			while (r < s.length() && s.charAt(l) == s.charAt(r)) {
				count++;
				r++;

			}

			result.append(s.charAt(l)).append(count);
			count = 0;
			l = r;

		}

		System.out.println(result);

	}

}
