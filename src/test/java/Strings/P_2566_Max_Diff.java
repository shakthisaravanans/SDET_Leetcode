package Strings;

public class P_2566_Max_Diff {

	public int minMaxDifference(int num) {

		String temp = String.valueOf(num);

		int i = 0;
		char maxnum = '$', Minnum = '$';
		while (i < temp.length()) {
			if (temp.charAt(i) != '9') {
				maxnum = temp.charAt(i);
				break;
			}
			i++;
		}
		i = 0;
		while (i < temp.length()) {
			if (temp.charAt(i) != '0') {
				Minnum = temp.charAt(i);
				break;
			}
			i++;
		}

//	String Maxval = temp.replace(maxnum, '9');
//	
//String Minval = temp.replace(Minnum, '0');
//	
	
	
		
		return Integer.valueOf(temp.replace(maxnum, '9')) - Integer.valueOf(temp.replace(Minnum, '0'));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2566_Max_Diff sample = new P_2566_Max_Diff();

		System.out.println(sample.minMaxDifference(90));
	}

}
