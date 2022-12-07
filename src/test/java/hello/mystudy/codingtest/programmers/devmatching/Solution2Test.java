package hello.mystudy.codingtest.programmers.devmatching;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution2Test {
	@Test
	void test() {
		String[] record = {"yang:1,2,3,4", "jack:2,0,4,5"};
		Solution2 test = new Solution2();
		String[] result = test.solution(record);
		assertThat(result).containsExactly("yang", "jack");
	}
}