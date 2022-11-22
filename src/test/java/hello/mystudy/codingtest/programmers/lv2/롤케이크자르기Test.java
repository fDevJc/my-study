package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 롤케이크자르기Test {

	@Test
	void solution() {
		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		롤케이크자르기 test = new 롤케이크자르기();
		int result = test.solution(topping);
		assertThat(result).isEqualTo(2);
	}

	@Test
	void solution2() {
		int[] topping = {1, 2, 3, 1, 4};
		롤케이크자르기 test = new 롤케이크자르기();
		int result = test.solution(topping);
		assertThat(result).isEqualTo(0);
	}
}