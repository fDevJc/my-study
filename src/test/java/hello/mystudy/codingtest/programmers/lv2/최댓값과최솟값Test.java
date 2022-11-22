package hello.mystudy.codingtest.programmers.lv2;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 최댓값과최솟값Test {

	@Test
	void solution1() {
		String s = "1 2 3 4";
		최댓값과최솟값 test = new 최댓값과최솟값();
		String result = test.solution(s);
		Assertions.assertThat(result).isEqualTo("1 4");
	}
	@Test
	void solution2() {
		String s = "-1 -2 -3 -4";
		최댓값과최솟값 test = new 최댓값과최솟값();
		String result = test.solution(s);
		Assertions.assertThat(result).isEqualTo("-4 -1");
	}
	@Test
	void solution3() {
		String s = "-1 -1";
		최댓값과최솟값 test = new 최댓값과최솟값();
		String result = test.solution(s);
		Assertions.assertThat(result).isEqualTo("-1 -1");
	}
}