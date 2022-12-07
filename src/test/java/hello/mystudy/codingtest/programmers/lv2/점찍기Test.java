package hello.mystudy.codingtest.programmers.lv2;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 점찍기Test {

	@Test
	void solution1() {
		int k = 2;
		int d = 4;

		점찍기 test = new 점찍기();
		long result = test.solution(k, d);

		Assertions.assertThat(result).isEqualTo(6);
	}

	@Test
	void solution2() {
		int k = 1;
		int d = 5;

		점찍기 test = new 점찍기();
		long result = test.solution(k, d);

		Assertions.assertThat(result).isEqualTo(26);
	}

	@Test
	void solution3() {
		int k = 1;
		int d = 4;

		점찍기 test = new 점찍기();
		long result = test.solution(k, d);

		Assertions.assertThat(result).isEqualTo(17);
	}
}