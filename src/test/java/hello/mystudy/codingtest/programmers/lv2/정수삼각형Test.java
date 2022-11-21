package hello.mystudy.codingtest.programmers.lv2;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 정수삼각형Test {
	@Test
	void solution() {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		정수삼각형 test = new 정수삼각형();
		int result = test.solution(triangle);
		Assertions.assertThat(result).isEqualTo(30);
	}
}