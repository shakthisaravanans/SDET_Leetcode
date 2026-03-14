package Demo_int;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Demo_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Acrg153dgdh321";
		// op :Acrg351dgdh123;

		LinkedList<Integer> L1 = new LinkedList<Integer>();

		for (char i : s.toCharArray()) {
			int temp = i - '0';

			if (temp<=9&&temp>=0) {
				L1.add(temp);
			}

		}

		StringBuilder sample = new StringBuilder();

		int Count = L1.size();

		for (char j : s.toCharArray()) {
			int temp = j - '0';
			if (!(temp >= 67 && temp < 67 + 26) || (temp >= 96 && temp < 96 + 26)) {
				sample.append(L1.get(Count--));
			} else {
				sample.append(j);
			}

		}

	}

}
