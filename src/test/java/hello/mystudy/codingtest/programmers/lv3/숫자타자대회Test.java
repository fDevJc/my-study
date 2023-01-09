package hello.mystudy.codingtest.programmers.lv3;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 숫자타자대회Test {
	@Test
	void test() {
		String numbers = "1756";
		숫자타자대회 test = new 숫자타자대회();
		int result = test.solution(numbers);

		assertThat(result).isEqualTo(10);

	}

	@Test
	void test2() {
		String numbers = "5123";
		숫자타자대회 test = new 숫자타자대회();
		int result = test.solution(numbers);

		assertThat(result).isEqualTo(8);

	}
}