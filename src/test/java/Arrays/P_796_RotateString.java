package Arrays;

public class P_796_RotateString {
	public boolean rotateString1(String s, String goal) {

		int i = s.indexOf(goal.charAt(0)), j = 0;

		if (s.length() != goal.length()) {
			return false;
		}

		while (i < s.length()) {

			if (s.charAt(i) != goal.charAt(j)) {
				return false;
			}
			if (i >= s.length())

			{
				i = 0;
			} else {
				i++;
			}

			j++;

		}

		return true;

	}
	
	
	
	public boolean rotateString(String s, String goal) {

		if (s.length() != goal.length()) {
			return false;
		}
		
		
		
		return (s+s).contains(goal);
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_796_RotateString sample = new P_796_RotateString();

		System.out.println(sample.rotateString("defdefdefabcabc", "defdefabcabcdef"));
	}

}
