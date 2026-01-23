package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.swing.JPopupMenu.Separator;

public class P_2788_Split_Strings_sep {

	public List<String> splitWordsBySeparator(List<String> words, char separator) {

		List<String> Results = new ArrayList<String>();
		
		
		String Splitregex ="\\"+separator;
		for (String s : words) {

			String[] temp = s.split(Splitregex);

			for (String resultss : temp) {

				if (!resultss.trim().isBlank()) {
					Results.add(resultss);
				}

			}

		}

		
		Set<Character> s = new HashSet<Character>();
		
		return Results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_2788_Split_Strings_sep sample = new P_2788_Split_Strings_sep();

		List<String> words = Arrays.asList("$easy$", "$problem$");

		System.out.println(sample.splitWordsBySeparator(words, '$'));
	}

}
