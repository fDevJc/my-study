package hello.mystudy.codingtest.programmers.lv2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class 행렬테두리회전하기Test {

	@Test
	void test() {
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
		행렬테두리회전하기 test = new 행렬테두리회전하기();
		int[] result = test.solution(rows, columns, queries);

		assertThat(result).containsExactly(8, 10, 25);
	}

	@Test
	void test1() {
		int rows = 3;
		int columns = 3;
		int[][] queries = {{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}};
		행렬테두리회전하기 test = new 행렬테두리회전하기();
		int[] result = test.solution(rows, columns, queries);

		assertThat(result).containsExactly(1, 1, 5, 3);
	}

	@Test
	void test2() {
		int rows = 100;
		int columns = 97;
		int[][] queries = {{1, 1, 100, 97}};
		행렬테두리회전하기 test = new 행렬테두리회전하기();
		int[] result = test.solution(rows, columns, queries);

		assertThat(result).containsExactly(1);
	}
}