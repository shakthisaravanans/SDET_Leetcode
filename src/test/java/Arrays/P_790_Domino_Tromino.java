package Arrays;

public class P_790_Domino_Tromino {

	public int numTilings(int n) {
		int[] cache = new int[n+2];
		final int MOD = 1_000_000_007;
		cache[0] = 1;
		cache[1] = 1;
		cache[2] = 2;
		for (int i = 3; i <= n; i++) {
			cache[i] = (2 * cache[i - 1] % MOD + cache[i - 3]) % MOD;

		}

		return cache[n];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_790_Domino_Tromino s = new P_790_Domino_Tromino();

		System.out.println(s.numTilings(1));

	}

}
