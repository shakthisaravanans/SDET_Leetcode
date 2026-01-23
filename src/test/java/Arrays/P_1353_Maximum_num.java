package Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P_1353_Maximum_num {

	public int maxEvents(int[][] events) {

		Arrays.sort(events, (a, b) -> a[0] - b[0]);

		/*
		 * first sort it
		 * 
		 * from day1 till n length of event
		 * 
		 * prioeity queue --- > while i<n evnet[i][0]<=day) {pq.push;i++}
		 * 
		 * while(!pq.isempty && pq.top <days) {pq.pop;}
		 * 
		 * if(!pq.isempty && pq.top <= days){pq.pop;result++;}
		 * 
		 * 
		 * 
		 * 
		 */

		int index = 0, n = events.length,Result=0;

		PriorityQueue<Integer> Pq = new PriorityQueue();

		for (int days = 1; !Pq.isEmpty() || index < n; days++) {

			while (index < n && events[index][0] <= days) {
				Pq.offer(events[index][1]);
				index++;
			}
			
			while(!Pq.isEmpty() && Pq.peek()<days) {
				Pq.poll();
			}
			
			if(!Pq.isEmpty() && Pq.peek()<=days) {
				Pq.poll();
				Result++;
			}
			

		}

		return Result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
