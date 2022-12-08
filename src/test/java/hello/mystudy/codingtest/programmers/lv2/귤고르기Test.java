package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 귤고르기Test {

	@Test
	void solution() {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		귤고르기 test = new 귤고르기();

		int result = test.solution(k, tangerine);

		assertThat(result).isEqualTo(3);
	}

	@Test
	void solution1() {
		int k = 4;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		귤고르기 test = new 귤고르기();

		int result = test.solution(k, tangerine);

		assertThat(result).isEqualTo(2);
	}

	@Test
	void solution2() {
		int k = 2;
		int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
		귤고르기 test = new 귤고르기();

		int result = test.solution(k, tangerine);

		assertThat(result).isEqualTo(1);
	}
}