package List;

import java.util.ArrayList;
import java.util.List;

import Arrays.need;

public class P_2327_No_Secrects {

	public int peopleAwareOfSecret(int n, int delay, int forget) {

		List<Integer> Result = new ArrayList<Integer>();
		int j = 0;
		Result.add(0);
		for (int i = 1; i <= n; i++) {
			int Lid = 0, CurentsizeList = Result.size();
			while (Lid <CurentsizeList) {
				int curent_val = Result.get(Lid);
				if (curent_val + 1 == forget) {
					Result.remove(Lid);
					Lid++;
					continue;
				}
				if (curent_val+ 1 >= delay) {
					Result.addLast(0);
					Result.remove(Lid);
					Result.add(Lid, curent_val + 1);
				}else {
					Result.remove(Lid);
					Result.add(Lid, curent_val + 1);}
				Lid++;
			}

		}

		return Result.size();

	}
	need to check 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2327_No_Secrects sample = new P_2327_No_Secrects();
		System.out.println(sample.peopleAwareOfSecret(6, 2, 4));

	}

}
