package Strings;

public class P_2810_Faulty_Keyboard {

	public String finalString(String s) {

		StringBuilder Result = new StringBuilder();

		for (char c : s.toCharArray()) {
			
			if (c == 'i') {
				Result.reverse();
			} else {
				Result.append(c);
			}

		}

		return Result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2810_Faulty_Keyboard sample = new P_2810_Faulty_Keyboard();

		System.out.println(sample.finalString("poiinter"));
	}

}
