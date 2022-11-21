package hello.mystudy.codingtest.programmers.lv2;

import java.util.Arrays;

public class 정수삼각형 {

	public int solution(int[][] triangle) {
		for (int i = 1; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				if (j == 0) {
					triangle[i][j] += triangle[i - 1][0];
				} else if (j == triangle[i].length - 1) {
					triangle[i][j] += triangle[i - 1][triangle[i - 1].length - 1];
				} else {
					triangle[i][j] += Integer.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
				}
			}
		}
		return Arrays.stream(triangle[triangle.length - 1]).max().getAsInt();
	}
}
