package hello.mystudy.codingtest.programmers.codility;

public class Task1 {

	public int solution(int[] A) {
		int n = A.length;
		boolean[] marker = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			if (A[i] > 0) {
				marker[A[i]] = true;
			}

		}
		for (int i = 1; i <= n; i++) {
			if (!marker[i]) {
				return i;
			}
		}
		return n + 1;
	}
}
