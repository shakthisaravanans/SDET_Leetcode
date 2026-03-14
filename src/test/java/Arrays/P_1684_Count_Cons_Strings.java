package Arrays;

public class P_1684_Count_Cons_Strings {

	public int countConsistentStrings(String allowed, String[] words) {

		int count = 0;
		outer:
		for (String s : words) {
			for (char c : s.toCharArray()) {
				if (allowed.indexOf(c) == -1) {
					continue outer;
				}
			}
			count++;	
		}
		return count;
	}
	
	public int countConsistentStrings1(String allowed, String[] words) {

		int count = 0;
	//	outer:
		for (String s : words) {
			boolean Flag = true;
			for (char c : s.toCharArray()) {
				if (allowed.indexOf(c) == -1) {
					Flag = false;
					break;
				}
			}

			if (Flag) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1684_Count_Cons_Strings sample = new P_1684_Count_Cons_Strings();
		String[] words = { "bd", "bd", "aaab", "baa", "badab" };
		System.out.println(sample.countConsistentStrings("ab", words));
	}

}
