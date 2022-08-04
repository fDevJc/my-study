package hello.mystudy.codingtest.toss;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 나만의L4만들기Test {
    나만의L4만들기 test = new 나만의L4만들기();
    @Test
    void ex1() {
        int servers = 2;
        boolean sticky = false;
        int[] requests = new int[]{1, 2, 3, 4};
        int[][] result = test.solution(servers, sticky, requests);
        int[][] expected = new int[][]{{1, 3}, {2, 4}};
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void ex2() {
        int servers = 2;
        boolean sticky = true;
        int[] requests = new int[]{1, 1, 2, 2};
        int[][] result = test.solution(servers, sticky, requests);
        int[][] expected = new int[][]{{1, 1}, {2, 2}};
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void ex3() {
        int servers = 2;
        boolean sticky = true;
        int[] requests = new int[]{1, 2, 2, 3, 4, 1};
        int[][] result = test.solution(servers, sticky, requests);
        int[][] expected = new int[][]{{1, 3, 1}, {2, 2, 4}};
        Assertions.assertThat(result).isEqualTo(expected);
    }
}