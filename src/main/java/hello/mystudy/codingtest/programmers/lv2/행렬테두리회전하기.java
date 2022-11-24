package hello.mystudy.codingtest.programmers.lv2;

public class 행렬테두리회전하기 {
	public int[] solution(int rows, int columns, int[][] queries) {
		int[][] board = new int[rows][columns];
		int number = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = number++;
			}
		}

		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			int r1 = query[0] - 1;
			int c1 = query[1] - 1;
			int r2 = query[2] - 1;
			int c2 = query[3] - 1;

			int tmp = board[r1][c1];
			int min = tmp;

			//위 올리기
			for (int j = r1; j < r2; j++) {
				min = Math.min(min, board[j + 1][c1]);
				board[j][c1] = board[j + 1][c1];
			}

			//왼쪽으로 밀기
			for (int j = c1; j < c2; j++) {
				min = Math.min(min, board[r2][j + 1]);
				board[r2][j] = board[r2][j + 1];
			}

			//아래 내리기
			for (int j = r2; j > r1; j--) {
				min = Math.min(min, board[j - 1][c2]);
				board[j][c2] = board[j - 1][c2];
			}

			//오른쪽 밀기
			for (int j = c2; j > c1 + 1; j--) {
				min = Math.min(min, board[r1][j - 1]);
				board[r1][j] = board[r1][j - 1];
			}

			board[r1][c1 + 1] = tmp;
			answer[i] = min;

		}
		return answer;
	}
}
