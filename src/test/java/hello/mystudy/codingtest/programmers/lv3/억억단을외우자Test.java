package hello.mystudy.codingtest.programmers.lv3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 억억단을외우자Test {
	@Test
	void test1() {
		int e = 8;
		int[] starts = {1, 3, 7};

		억억단을외우자 test = new 억억단을외우자();

		int[] result = test.solution(e, starts);

		Assertions.assertThat(result).containsExactly(6, 6, 8);

	}

}