package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 혼자놀기의달인Test {

	@Test
	void solution() {
		int[] cards = {8, 6, 3, 7, 2, 5, 1, 4};

		혼자놀기의달인 test = new 혼자놀기의달인();
		int result = test.solution(cards);

		assertThat(result).isEqualTo(12);
	}
}