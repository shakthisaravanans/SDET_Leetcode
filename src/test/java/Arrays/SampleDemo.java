package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[] word = {"Sakthi","S","Sakthi","Sakthi","S"};

Set<String> Collectionset = new HashSet<String>();

Set<String> Uniqueset = new HashSet<String>();



for(String s :word)

{
if(!Collectionset.add(s))
{
Uniqueset.add(s);
}
}

System.out.println(Uniqueset);


String Words = "I Love India";



String[] temp = Words.split(" ");

StringBuilder Result = new StringBuilder();

String Results = "";

for(int i=temp.length-1;i>=0;i--)
{
	Results = Results.concat(temp[i]+ " ");
	
	
	
	
}

System.out.println(Results);


	}

}
