package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 이중우선순위큐Test {

	@Test
	void solution() {
		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

		이중우선순위큐 test = new 이중우선순위큐();
		int[] solution = test.solution(operations);

		assertThat(solution).containsExactly(0, 0);
	}

	@Test
	void solution1() {
		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		이중우선순위큐 test = new 이중우선순위큐();

		int[] solution = test.solution(operations);

		assertThat(solution).containsExactly(333, -45);
	}
}