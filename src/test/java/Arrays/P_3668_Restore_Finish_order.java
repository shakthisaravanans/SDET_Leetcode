package Arrays;

public class P_3668_Restore_Finish_order {

	public int[] recoverOrder(int[] order, int[] friends) {

		int[] friendsindex = new int[101];

		for (int i : friends) {
			friendsindex[i]++;
		}
		int count = 0;
		for (int i : order) {
			if (friendsindex[i] != 0) {
				friends[count++] = i;
			}
		}
		return friends;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_3668_Restore_Finish_order sample = new P_3668_Restore_Finish_order();
		int[] order = { 3, 1, 2, 5, 4 };
		int[] friends = { 1, 3, 4 };
		System.out.println(sample.recoverOrder(order, friends).toString());
	}

}
