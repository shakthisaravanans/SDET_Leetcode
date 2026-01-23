package Strings;

import java.util.Stack;

public class P_1021_Remove_out_par {

	 public String removeOuterParentheses(String s) {
		 
		 
		 Stack<Character> stack = new Stack();
		 StringBuilder results =  new StringBuilder();

		 for(char c : s.toCharArray())
		 {

		 if(stack.peek()=='(' && c==')' && !stack.isEmpty())
		 {stack.
		 stack.pop();
		 results.append('(').appends(')');
		 }else if(stack.peek=='(' && c=='('){stack.push('(');}



		 
		 
		 
		return results.toString();
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1021_Remove_out_par sample = new P_1021_Remove_out_par();
		
		
	}

}
