package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 디펜스게임Test {

	@Test
	void solution() {
		int n = 7;
		int k = 3;
		int[] enemy = {4, 2, 4, 5, 3, 3, 1};

		디펜스게임 test = new 디펜스게임();

		int result = test.solution(n, k, enemy);

		assertThat(result).isEqualTo(5);

	}

	@Test
	void solution1() {
		int n = 2;
		int k = 4;
		int[] enemy = {3, 3, 3, 3};

		디펜스게임 test = new 디펜스게임();

		int result = test.solution(n, k, enemy);

		assertThat(result).isEqualTo(4);

	}
}