package Strings;

public class P_1678_Goal_Parse_Inter {

	public String interpret(String command) {

		int i = 0;
		StringBuilder result = new StringBuilder();
		while (i < command.length()) {
			switch (command.charAt(i)) {
			case '(': {
				if (')' == command.charAt(i + 1)) {
					result.append("o");
				}
				i++;
				break;
			}
			case ')': {
				i++;
				break;
			}
			default: {
				result.append(command.charAt(i));
				i++;
			}

			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1678_Goal_Parse_Inter sample = new P_1678_Goal_Parse_Inter();
		String command = "(al)G(al)()()G";

		System.out.println(sample.interpret(command));

	}

}
