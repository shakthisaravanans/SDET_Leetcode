package Arrays;

import java.util.HashSet;
import java.util.Set;

public class P_1925_CountSquare_sumTrip {

	/*
	 * input : n =5 oo/P : 2
	 * 
	 * a2+b2 =c2 The square triples are (3,4,5) and (4,3,5).
	 * 
	 */

	public int countTriples1(int n) {

		Set<Integer> square = new HashSet<Integer>();
		int results = 0;
		for (int i = 0; i <= n; i++) {
			square.add(i * i);
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; (j < n); j++) {
				if (square.contains((i * i) + (j * j))) {
					results++;
				}
			}

		}

		return results;

	}

	public int countTriples(int n) {

		// Set<Integer> square = new HashSet<Integer>();
		int[] tripple = new int[250];
		int results = 0;
		for (int i = 1; i <= n; i++) {
			tripple[i * i] = 1;
			// square.add(i * i);
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; (j < n); j++) {
				if (i != j && tripple[(i * i) + (j * j)] == 1) {
					results++;
				}
			}

		}

		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1925_CountSquare_sumTrip sample = new P_1925_CountSquare_sumTrip();
		System.out.println(sample.countTriples(5));
	}

}
