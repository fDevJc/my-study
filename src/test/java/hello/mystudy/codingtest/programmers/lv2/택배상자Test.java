package hello.mystudy.codingtest.programmers.lv2;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 택배상자Test {

	@Test
	void solution() {
		int[] order = {4, 3, 1, 2, 5};
		택배상자 test = new 택배상자();
		int result = test.solution(order);

		Assertions.assertThat(result).isEqualTo(2);
	}

	@Test
	void solution2() {
		int[] order = {5, 4, 3, 2, 1};
		택배상자 test = new 택배상자();
		int result = test.solution(order);

		Assertions.assertThat(result).isEqualTo(5);
	}
}