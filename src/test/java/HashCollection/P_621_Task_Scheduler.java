package HashCollection;

import java.util.HashMap;

import com.beust.jcommander.internal.Maps;

public class P_621_Task_Scheduler {

	public int leastInterval(char[] tasks, int n) {
	
		int results = 0;
		/*
		 * Step 1 :  map is n+1 >mapsize (map is less then n 
		 * 
		 * 
		 * else 
		 * 4-2 ==2 -- 
		 * n=0;
		 * then result =mapsize-n
		 * 
		 * reduce -1 and remove when it is 0;
		 * */
		HashMap<Character,Integer> maps =  new HashMap<Character,Integer>();
		for(char a:tasks)
		{
			maps.put(a,maps.getOrDefault(a,0)+1);
		}
		
		while(maps.size()!=0)
		{
			
			int lastmapsize = maps.size();
			results+=lastmapsize;
			maps.replaceAll((k,v)->v-1);
			maps.entrySet().removeIf(e->e.getValue()==0);
			if(n+1>maps.size() && !maps.isEmpty()) {results+=(n+1)-lastmapsize;}
			
		}
		
		
		return results;

	}
	
	int[] car = new int[3];
    public void ParkingSystem(int big, int medium, int small) {
        car[0]=big;
        car[1]=medium;
        car[2]=small;
    }
    
    public boolean addCar(int carType) {
    	//car[carType]--<=0?false:true;
        return car[carType]--<=0?false:true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_621_Task_Scheduler sample = new P_621_Task_Scheduler();
		
		//char[] task = {'A','B','A'}; // A,B,idle, 3-2 =1 +2 3  2) a 1  == 3>
		char[] task = {'B','C','D','A','A','A','A','G'};
		//A=4,b=1,c1,d1,g1 -- abcdg-a1a1a
		System.out.println(sample.leastInterval(task,1));

	}

}
