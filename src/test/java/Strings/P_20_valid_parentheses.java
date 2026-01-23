package Strings;

import java.util.ArrayList;
import java.util.Stack;

public class P_20_valid_parentheses {

	public boolean isValid(String s) {

		Stack<Character> ls = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				ls.push(s.charAt(i));
			} else {
				if (ls.isEmpty()) {
					return false;
				} else if (s.charAt(i) == ']' && ls.peek() == '[') {
					ls.pop();
					continue;
				} else if (s.charAt(i) == ')' && ls.peek() == '(') {
					ls.pop();
					continue;
				} else if (s.charAt(i) == '}' && ls.peek() == '{') {
					ls.pop();
					continue;
				} else {
					return false;
				}

			}
		}
		return ls.isEmpty();
	}

	public boolean isValid1(String s) {

		Stack<Character> ls = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				ls.push(s.charAt(i));
			} else {

				if (ls.isEmpty()) {
					return false;
				} else if (s.charAt(i) == ']' && ls.peek() == '[') {
					ls.pop();
				} else if (s.charAt(i) == ')' && ls.peek() == '(') {
					ls.pop();
				} else if (s.charAt(i) == '}' && ls.peek() == '{') {
					ls.pop();
				} else {
					return false;
				}

			}
		}
		return ls.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_20_valid_parentheses s = new P_20_valid_parentheses();
		
		

		System.out.println(s.isValid("()[]{}"));

	}

}
