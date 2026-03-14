package List;

public class P_3248_Snake_inMatrix {

	public int finalPositionOfSnake(int n, List<String> commands) {

		int Results = 0;

		for (String l : commands) {
			switch (l) {
			case "RIGHT": {
				Results++;

				break;
			}

			case "LEFT": {
				Results--;

				break;
			}

			case "DOWN": {
				Results += n;

				break;
			}

			case "UP": {
				Results -= n;

				break;
			}
			}
		}

		return Results;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
