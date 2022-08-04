package hello.mystudy.codingtest.programmers.lv1;

import hello.mystudy.codingtest.programmers.lv1.크레인인형뽑기;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 크레인인형뽑기Test {
    크레인인형뽑기 solution = new 크레인인형뽑기();
    @Test
    void ex1() {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] move = {1,5,3,5,1,2,1,4};
        int result = solution.solution(board, move);

        assertThat(result).isEqualTo(4);

    }
}