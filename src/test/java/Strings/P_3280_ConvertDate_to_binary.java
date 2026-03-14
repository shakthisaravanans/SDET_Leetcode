package Strings;

public class P_3280_ConvertDate_to_binary {

	public String convertDateToBinary(String date) {

		String[] temp = date.split("-");
		StringBuilder result = new StringBuilder();
		for (String s : temp) {
			result.append("-").append(Integer.toBinaryString(Integer.parseInt(s)));

		}

		return result.replace(0, 1, "").toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3280_ConvertDate_to_binary sample = new P_3280_ConvertDate_to_binary();

		String date = "2080-02-29";

		System.out.println(sample.convertDateToBinary(date));
	}

}
