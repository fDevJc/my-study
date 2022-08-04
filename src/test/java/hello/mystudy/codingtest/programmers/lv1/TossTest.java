package hello.mystudy.codingtest.programmers.lv1;

import hello.mystudy.codingtest.programmers.lv1.Toss;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TossTest {
    Toss toss = new Toss();
    @Test
    void ex1() {
        int servers = 2;
        boolean sticky = false;
        int[] requests = new int[]{1, 2, 3, 4};
        int[][] result = toss.solution(servers, sticky, requests);
        int[][] expected = new int[][]{{1, 3}, {2, 4}};
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void ex2() {
        int servers = 2;
        boolean sticky = true;
        int[] requests = new int[]{1, 1, 2, 2};
        int[][] result = toss.solution(servers, sticky, requests);
        int[][] expected = new int[][]{{1, 1}, {2, 2}};
        Assertions.assertThat(result).isEqualTo(expected);
    }
}