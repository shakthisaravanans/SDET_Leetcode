package Strings;

import java.util.ArrayList;
import java.util.List;

public class P_2942_Words_Contains {

public List<Integer> findWordsContaining(String[] words, char x) {
	
	List<Integer> l1 = new ArrayList<Integer>();
	
	for (int i = 0; i < words.length; i++) {
		if(words[i].contains(Character.toString(x))) {
			
			l1.add(i);
		}
		
	}
	
	
	
	
	
	return l1;
        
	
	
	
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2942_Words_Contains sample = new P_2942_Words_Contains();
		
		String word[] = {"leet","code"};
		
		System.out.println(sample.findWordsContaining(word,'e'));
	}

}
