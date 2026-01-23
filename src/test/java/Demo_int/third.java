package Demo_int;

import java.util.Stack;

public class third {

	public boolean correctstring(String s) {

		Stack<Character> bra = new Stack<Character>();

		if (s.charAt(0) == '}' | s.charAt(0) == ']' | s.charAt(0) == ')') {
			return false;
		}
		int i = 0;
		while (i < s.length()) {

			if (s.charAt(i) == '{' | s.charAt(i) == '[' | s.charAt(i) == '(') {
				bra.add(s.charAt(i));
			} else {
				if (s.charAt(i) == '}' & bra.peek() == '{') {
					bra.pop();
				} else if (s.charAt(i) == ')' & bra.peek() == '(') {
					bra.pop();
				} else if (s.charAt(i) == ']' & bra.peek() == '[') {
					bra.pop();
				} else {
					return false;
				}

			}
i++;
		}

		return bra.empty();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A String containing (), {}, and [], write a function to check if it's valid.
		// Input: “{[()]}”.

		String s = "{[(()]}";
		third t = new third();
		
		System.out.println(t.correctstring(s));
		//t.correctstring(s);

	}

}
