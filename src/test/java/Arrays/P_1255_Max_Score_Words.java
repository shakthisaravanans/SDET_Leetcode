package Arrays;

public class P_1255_Max_Score_Words {

	public int maxScoreWords(String[] words, char[] letters, int[] score) {

		int[] Nletters = new int[26];

		int MaxScoreWords = 0;

		for (char i : letters) {
			Nletters[i - 97]++;
		}

		for (String s : words) {
			int Tempmax =0;
			for (char c : s.toCharArray()) {
				
				if(Nletters[c-97]<=0)
				{
					Tempmax=0;
					break;
				}else {
					Nletters[c-97]--;
					Tempmax+=score[c-97];
				}
				
			}
			MaxScoreWords = Math.max(Tempmax, MaxScoreWords);
		}

		//System.out.println(Nletters);
		return MaxScoreWords;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_1255_Max_Score_Words sample = new P_1255_Max_Score_Words();
		int[] score = { 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		char[] letters = { 'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o' };
		String[] words = { "dog", "cat", "dad", "good" };

		int a = 'z'; // --97
		System.out.println(sample.maxScoreWords(words, letters, score));
	}

}
