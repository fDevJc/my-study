package hello.mystudy.programmers.lv1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 폰켓몬Test {
    폰켓몬 solution = new 폰켓몬();
    
    @Test
    void ex1() {
        int[] nums = {3,1,2,3};
        int result = solution.solution(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void ex2() {
        int[] nums = {3,3,3,2,2,4};
        int result = solution.solution(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void ex3() {
        int[] nums = {3,3,3,2,2,2};
        int result = solution.solution(nums);
        assertThat(result).isEqualTo(2);
    }
}