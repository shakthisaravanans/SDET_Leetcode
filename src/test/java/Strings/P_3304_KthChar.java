package Strings;

public class P_3304_KthChar {

	public char kthCharacter1(int k) {

		StringBuilder s = new StringBuilder("a");

		while (s.length() < k) {
			int Temp = s.length();

			for (int i = 0; i < Temp; i++) {
				if (s.charAt(i) == 122) {
					s.append('a');
				} else {
					s.append((char) (s.charAt(i) + 1));
				}

			}

		}

		return s.charAt(k - 1);

	}

	public char kthCharacter(int k) {
		
		// int position = Integer.bitCount(k).bitCount(k - 1);

		int Count = 0;
		while (k > 1) {
			// int jump = (int) Math.ceil(Math.log(k) / Math.log(2));
			k -= Math.pow(2, Math.ceil(Math.log(k) / Math.log(2)) - 1);
			Count++;

		}
		return (char) ('a' + (Count % 26));

	}

	public char kthCharacter1(long k, int[] operations) {
		StringBuilder s = new StringBuilder("a");
		int op = 0;
		while (s.length() < k) {
			int Temp = s.length();

			if (operations[op] == 0) {

				s.append(s);

			} else {

				for (int i = 0; i < Temp; i++) {
					if (s.charAt(i) == 122) {
						s.append('a');
					} else {
						s.append((char) (s.charAt(i) + 1));
					}

				}
			}

			op++;
		}

		return s.charAt((int) (k - 1));
	}

	public char kthCharacter11(long k, int[] operations) {
		int[] sizes = new int[operations.length + 1];
		sizes[0] = 1;

		// Precompute the length after each operation
		for (int i = 0; i < operations.length; i++) {
			if (operations[i] == 0) {
				sizes[i + 1] = sizes[i] * 2;
			} else {
				sizes[i + 1] = sizes[i] + sizes[i];
			}

			if (sizes[i + 1] >= k) {
				break;
			}
		}

		// Now walk backward to find what original character it maps to
		char ch = 'a';
		int opIndex = operations.length;

		while (opIndex > 0) {
			opIndex--;
			int op = operations[opIndex];
			long prevSize = sizes[opIndex];

			if (k > prevSize) {
				k -= prevSize;

				if (op == 1) {
					ch = (char) ((ch - 'a' + 1) % 26 + 'a'); // rotate to next char
				}
				// if op == 0, it’s just a copy, we continue
			}
		}

		return ch;
	}

	public char kthCharacter(long k, int[] operations) {

		int count = 0;

		while (k > 1) {
			int jump = (int) Math.ceil(Math.log(k) / Math.log(2));

			k -= Math.pow(2, (jump - 1));
			count += operations[jump - 1];

		}

		return (char) ('a' + (count % 26));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_3304_KthChar sample = new P_3304_KthChar();
		int k1 = 32576176;
		int[] operations1 = { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1 };

		int k = 6;
		int[] operations = { 0, 1, 0, 1 };
		/*
		 * aabbaabbbbccbbcc
		 */
		// System.out.println(sample.kthCharacter(k, operations1));

		System.out.println(sample.kthCharacter(5));
	}

}
