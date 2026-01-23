package Java8Features.StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class CollectionsinStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("A", 3000);
		maps.put("B", 1000);
		maps.put("C", 2000);
		maps.put("D", 4000);
		
		
		
		//------- stream values

		maps.entrySet().stream()
		.filter(n -> n.getValue() > 2000)
		.forEach(n->System.out.print(n.getKey()));
		maps.put("A", 3000);
		maps.put("B", 1000);
		maps.put("C", 2000);
		maps.put("D", 4000);
		
		
		
		// second high salary --- >
		
//		maps.entrySet().stream()
//		.sorted((a,b) ->b.compareto(a)).limit(2).min(maps.keySet()).forEach(System.out::println);
//		
		Optional<Entry<String, Integer>> Secmin = maps.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).limit(2)
				.min(Map.Entry.comparingByValue());
		
	System.out.println(Secmin);
		
		
		

	//	maps.values().stream().sorted(maps.values() >maps.values())
		
	//	limit(2).forEach(System.out::print);
		
		List<Integer> l =  new ArrayList<Integer>(Arrays.asList(5,2,8,4));
		System.out.println("----Sorting order---------");
		l.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		System.out.println("----Sorting order witho out method referance---------");
		l.stream().sorted(Comparator.reverseOrder())
		.forEach(a->System.out.println(a));
		System.out.println("----Sorting order compare to ---------");
		l.stream().sorted((a,b) -> b.compareTo(a)).forEach(a -> System.out.print(a));
		
		
		System.out.println("----sum---------");
		
		l.stream().mapToInt(Integer::intValue).sum();
		
		// or by using reduce..
		
		// l.stream().reduce(0,(a,b) -> a+b);
		
		System.out.println(l.stream().reduce(0,(a,b) -> a+b));

	}

}
