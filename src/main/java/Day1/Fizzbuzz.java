package Day1;

import java.util.Arrays;
import java.util.Iterator;

public class Fizzbuzz {
	
	public int sample() {
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fizzbuzz ss= new Fizzbuzz();
		ss.sample();
		int n = 15;
		String[] s = new String[n];
		for (int i = 1; i <=n; i++) {

			if ((i % 5 == 0) & (i % 3 == 0)) {
				s[i-1] = "FuzzBuzz";
				break;

			} else if (i % 5 == 0) {
				s[i-1] = "Buzz";
			} else if (i % 3 == 0) {
				s[i-1] = "Fuzz";

			} else {
				s[i-1] = String.valueOf(i);
			}
		}
		System.out.println(Arrays.toString(s));
	}

}
