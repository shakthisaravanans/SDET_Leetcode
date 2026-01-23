package Java8Features.LamdaExpression;

public class Jav8Funtionalinterface {

	/*
	 * this will be normal way of doing this abstrat class public int display(int
	 * a,int b) { return a+b; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lamda l = (a, b) -> {
			{
				return a + b;
			}
		};
		
		System.out.println(l.display(10, 20));
	}

	@FunctionalInterface
	interface lamda {

		public abstract int display(int a, int b);

	}
}
