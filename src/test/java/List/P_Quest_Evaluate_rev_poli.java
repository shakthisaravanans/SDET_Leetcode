package List;

import java.util.Stack;

public class P_Quest_Evaluate_rev_poli {

	public int evalRPN(String[] tokens) {

		Stack<Integer> Result = new Stack<Integer>();
		int Results = 0;

		for (String i : tokens) {
			switch (i) {
			case "+": {
				int Temp1 = Result.getLast();
				Result.pop();
				int Temp2 = Result.getLast();
				Result.pop();
				Result.push(Temp2 + Temp1);
				Results = Temp2 + Temp1;
				break;
			}
			case "-": {
				int Temp1 = Result.getLast();
				Result.pop();
				int Temp2 = Result.getLast();
				Result.pop();
				Result.push(Temp2 - Temp1);
				Results = Temp2 - Temp1;
				break;

			}
			case "/": {
				int Temp1 = Result.getLast();
				Result.pop();
				int Temp2 = Result.getLast();
				Result.pop();
				Result.push(Temp2 / Temp1);
				Results = Temp2 / Temp1;
				break;

			}

			case "*": {
				int Temp1 = Result.getLast();
				Result.pop();
				int Temp2 = Result.getLast();
				Result.pop();
				Result.push(Temp2 * Temp1);
				Results = Temp2 * Temp1;
				break;
			}

			default: {
				Result.push(Integer.valueOf(i));
			}

			}

		}

		return Result.peek();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Quest_Evaluate_rev_poli sample = new P_Quest_Evaluate_rev_poli();

		String[] tokens = { "4", "13", "5", "/", "+" };

		System.out.println(sample.evalRPN(tokens));
	}

}
