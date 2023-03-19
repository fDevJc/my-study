package hello.mystudy.codingtest.programmers.wesang;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {

	public String solution(int N, int K) {
		if (N == 1) {
			return String.join("", Collections.nCopies(K, "a"));
		}

		int[] count = new int[K];
		Arrays.fill(count, N / 2);

		if (N % 2 != 0) {
			count[0]++;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < K; i++) {
			char c = (char)('a' + i);

			while (count[i] > 0) {
				sb.append(c);
				count[i]--;
			}
		}

		String left = sb.toString();
		String right = new StringBuilder(left).reverse().toString();

		if (N % 2 != 0) {
			char c = left.charAt(left.length() - 1);
			sb.append(c);
		}

		sb.append(right);

		return sb.toString();
	}

}
