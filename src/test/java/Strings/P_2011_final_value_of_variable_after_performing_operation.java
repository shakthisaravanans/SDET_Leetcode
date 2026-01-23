package Strings;

public class P_2011_final_value_of_variable_after_performing_operation {

	public int finalValueAfterOperations1(String[] operations) {

		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].contains("+")) {
				x++;
			} else {
				x--;
			}

		}

		return x;

	}
	
	
	public int finalValueAfterOperations(String[] operations) {

		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].contains("+")) {
				x++;
			} else {
				x--;
			}

		}

		return finalValueAfterOperations(operations);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2011_final_value_of_variable_after_performing_operation s = new P_2011_final_value_of_variable_after_performing_operation();

		String[] ops = { "--X", "X++", "X++" };
		System.out.println(s.finalValueAfterOperations(ops));

	}

}
