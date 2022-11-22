package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 숫자카드나누기Test {

	@Test
	void solution() {
		int[] arrayA = {10, 17};
		int[] arrayB = {5, 20};

		숫자카드나누기 test = new 숫자카드나누기();
		int result = test.solution(arrayA, arrayB);

		assertThat(result).isEqualTo(0);
	}

	@Test
	void solution1() {
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};

		숫자카드나누기 test = new 숫자카드나누기();
		int result = test.solution(arrayA, arrayB);

		assertThat(result).isEqualTo(7);
	}

	@Test
	void solution2() {

		int[] arrayA = {10, 20};
		int[] arrayB = {5, 17};

		숫자카드나누기 test = new 숫자카드나누기();
		int result = test.solution(arrayA, arrayB);

		assertThat(result).isEqualTo(10);
	}

	@Test
	void solution3() {

		int[] arrayA = {24, 8, 12};
		int[] arrayB = {1};

		숫자카드나누기 test = new 숫자카드나누기();
		int result = test.solution(arrayA, arrayB);

		assertThat(result).isEqualTo(4);
	}
}