package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_118_Pascal {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> Outterlist = new ArrayList<List<Integer>>();
		Outterlist.add(Arrays.asList(1));

		for (int i = 0; i < numRows; i++) {
			List<Integer> lastlist = Outterlist.getLast();
			List<Integer> Innerlist = new ArrayList<Integer>();
			Innerlist.addFirst(1);
			for (int j = 1; j < lastlist.size(); j++) {
				Innerlist.add(lastlist.get(j - 1) + lastlist.get(j));

			}
			Innerlist.addLast(1);
			Outterlist.add(Innerlist);

		}

		return Outterlist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_118_Pascal sample = new P_118_Pascal();

		sample.generate(5);
		// System.out.println(sample.generate(5));
	}

}
