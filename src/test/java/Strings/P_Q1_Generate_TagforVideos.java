package Strings;

public class P_Q1_Generate_TagforVideos {

	public String generateTag(String caption) {

		String[] temp = caption.split(" ");
		

		StringBuilder result = new StringBuilder();

		int Len = temp.length;
		if (Len == 0) {
			return "#";
		}
		int count = 0;
		for (int i = 0; i < Len; i++) {

			if (!temp[i].trim().equals("")) {
				if (count == 0) {
					result.append("#").append(temp[i].toLowerCase());
				//	count++;
				}

				if (count!= 0) {
					result.append(Character.toUpperCase(temp[i].charAt(0))).append(temp[i].substring(1).toLowerCase());
				//	count++;
				}
				count++;
			}

		}

		return result.length() > 100 ? result.substring(0, 100).toString() : result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Q1_Generate_TagforVideos sample = new P_Q1_Generate_TagforVideos();

		String caption = " fPysaRtLQLiMKVvRhMkkDLNedQKffPnCjbITBTOVhoVjiKbfSawvpisDaNzXJctQkn";

		System.out.println(sample.generateTag(caption));
	}

}
