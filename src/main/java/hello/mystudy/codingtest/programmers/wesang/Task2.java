package hello.mystudy.codingtest.programmers.wesang;

public class Task2 {
	public int solution(String[] R) {
		int n = R.length;
		int m = R[0].length();
		boolean[][] cleaned = new boolean[n][m];
		int i = 0, j = 0, count = 0;
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int dir = 0;

		while (true) {
			if (!cleaned[i][j]) {
				cleaned[i][j] = true;
				count++;
			}
			int ni = i + dx[dir];
			int nj = j + dy[dir];

			if (ni >= 0 && ni < n && nj >= 0 && nj < m && R[ni].charAt(nj) == '.') {
				i = ni;
				j = nj;
			} else {
				dir = (dir + 1) % 4;
				ni = i + dx[dir];
				nj = j + dy[dir];

				if (ni >= 0 && ni < n && nj >= 0 && nj < m && R[ni].charAt(nj) == '.') {
					i = ni;
					j = nj;
				} else {
					break;
				}
			}
		}

		return count;
	}
}


