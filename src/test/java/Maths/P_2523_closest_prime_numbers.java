package Maths;

import java.util.ArrayList;
import java.util.Arrays;

public class P_2523_closest_prime_numbers {

	public int[] closestPrimes(int left, int right) {

		/*
		 * Step 1 find the primeno till end of right using create an array size of right
		 * & auto fill them with true check from 2 till right/2 fill them with false
		 * 
		 * 
		 * create arraylist and push primeno alone
		 * 
		 * traverse first element to end of loop first value - second values if (less
		 * than min values take i and j else traverse
		 * 
		 * 
		 * intlizsed min distance =0 a=-1 and b=-1 for loop till right to left check
		 * currnet is true if not got same way left avle checkit is true else moved
		 */

		Boolean[] prime = new Boolean[right + 2];
		Arrays.fill(prime, true);

		for (int i = 2; i * i <= right; i++) {
			if (prime[i] == true) {
				for (int j = i * i; j <=right; j = j + i) {
					prime[j] = false;
				}
			}
		}

		// System.out.println(Arrays.toString(prime));

		ArrayList<Integer> primeno = new ArrayList<Integer>();
		for (int k = left; k <= right; k++) {
			if (prime[k] == true) {
				primeno.add(k);
			}
		}

		// System.out.println(primeno);

		int mindis = Integer.MAX_VALUE;
		int a = -1, b = -1;
		for (int l = 0; l < primeno.size() - 1; l++) {
			if (mindis > (primeno.get(l + 1) - primeno.get(l))) {
				mindis = (primeno.get(l + 1) - primeno.get(l));
				a = primeno.get(l);
				b = primeno.get(l + 1);
			}
		}

		return new int[] { a, b };

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_2523_closest_prime_numbers s = new P_2523_closest_prime_numbers();
		System.out.println(Arrays.toString(s.closestPrimes(12854, 130337)));
	}

}
