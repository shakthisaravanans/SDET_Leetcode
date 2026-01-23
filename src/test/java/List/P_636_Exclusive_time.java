package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class P_636_Exclusive_time {

	public int[] exclusiveTime(int n, List<String> logs) {

		int[] rel = new int[n];
		int lasttimestamp = 0;
		Stack<Integer> Stacks = new Stack<Integer>();
		for (String S : logs) {
			String[] temp = S.split(":");
			int TempF = Integer.valueOf(temp[0]);
			int TempTS = Integer.valueOf(temp[2]);
			if (temp[1].equals("start")) {
				// Stacks.push(TempF);

				if (!Stacks.isEmpty()) {
					rel[Stacks.peek()] += TempTS - lasttimestamp;
				}
				lasttimestamp = TempTS;
				Stacks.push(TempF);

			} else {
				int Popstime = Stacks.pop();
				rel[Popstime] += (TempTS + 1) - lasttimestamp;
				lasttimestamp = TempTS + 1;
			}

		}

		return rel;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_636_Exclusive_time sample = new P_636_Exclusive_time();

		List<String> logs = Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6");
		System.out.println(Arrays.toString(sample.exclusiveTime(2, logs)));

		// [1,4] ts :
	}

}
