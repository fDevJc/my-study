package hello.mystudy.codingtest.programmers.lv3;

public class 억억단을외우자 {

	public int[] solution(int e, int[] starts) {
		int[] answer = new int[starts.length];
		int[][] board = new int[e + 1][2];

		int maxDivisor = 0;
		int maxNumber = 0;

		for (int i = 1; i <= e; i++) {
			for (int j = 1; j <= e; j++) {
				if (i * j > e) {
					break;
				}
				board[i*j][0]++;
			}
		}

		for (int i = e; i >= 1; i--) {
			if (board[i][0] >= maxDivisor) {
				maxDivisor = board[i][0];
				board[i][1] = i;
				maxNumber = i;
				continue;
			}
			board[i][1] = maxNumber;
		}

		for (int i = 0; i < starts.length; i++) {
			answer[i] = board[starts[i]][1];
		}

		return answer;
	}

	private static int getDivisorCount(int number) {
		int count = 0;

		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				if (i == number / i) {
					count++;
					continue;
				}
				count += 2;
			}
		}
		return count;
	}
}
