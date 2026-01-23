package Java8Features.LamdaExpression;

public class Java_Features_Lamda{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LamdaExpression cc = (a,b)-> { return (a+b); };
		System.out.println(cc.add(10, 20));
		
		
		
		/*
		 * Note : Lamda expression
		 * 1) Lambda expressions provide a clear and concise way to represent functional interfaces (interfaces with a single abstract method). 
		 * 2) @functionalinterface
		 * 3)with one abstract method
		 * 
		 */
	}

}
