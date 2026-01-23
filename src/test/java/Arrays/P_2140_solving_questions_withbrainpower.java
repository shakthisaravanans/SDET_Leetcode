package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class P_2140_solving_questions_withbrainpower {

	public long mostPoints1(int[][] questions) {
		long[] dp = new long[questions.length];

		Arrays.fill(dp, -1);
		int slowpointer = questions.length - 1;
		long temp = 0l, maxpoint = 0l;
		while (slowpointer >= 0) {
			int fastpointer = slowpointer;
			while (fastpointer <= questions.length - 1) {

				if (dp[fastpointer] != -1) {
					// System.out.println(questions[fastpointer][0]);
					temp = temp + questions[fastpointer][0];
					break;
				}
				temp = questions[fastpointer][0];
				// dp[slowpointer] = temp;
				fastpointer = fastpointer + questions[fastpointer][1] + 1;

			}

			maxpoint = Math.max(maxpoint, temp);
			dp[slowpointer] = maxpoint;
			temp = 0l;
			slowpointer--;
		}

		return maxpoint;

	}

	public long mostPoints(int[][] questions) {
		long[] dp = new long[questions.length];
		Arrays.fill(dp, -1);
		int slowpointer = questions.length - 1;
		int count = 0;
		long temp = 0l, maxpoint = 0l, bigmax = 0l;

		while (slowpointer >= 0) {
			int fastpointer = slowpointer;
			while (fastpointer <= questions.length - 1) {

				if (dp[fastpointer] != -1) {
					// System.out.println(questions[fastpointer][0]);
					temp = temp + questions[fastpointer][0];
					fastpointer = questions[fastpointer][1] + count++;
				} else {
					temp = questions[fastpointer][0];
					fastpointer = fastpointer + questions[fastpointer][1] + 1;
				}
				maxpoint = Math.max(maxpoint, temp);
				dp[slowpointer] = temp;
				// count++;
			}

			// maxpoint = Math.max(maxpoint, temp);
			// dp[slowpointer] = maxpoint;
			// temp = 0l;
			temp = 0l;
			slowpointer--;
		}

		return maxpoint;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] questions1 = { { 3, 2 }, { 4, 3 }, { 4, 4 }, { 2, 5 } };

		int[][] questions = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } };

		P_2140_solving_questions_withbrainpower s = new P_2140_solving_questions_withbrainpower();
		System.out.println(s.mostPoints(questions));

	}

}
