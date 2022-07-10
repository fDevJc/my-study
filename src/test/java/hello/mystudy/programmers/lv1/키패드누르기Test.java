package hello.mystudy.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class 키패드누르기Test {
    키패드누르기 test = new 키패드누르기();

    void solution(int[] numbers, String hand, String expected) {
        String result = test.solution(numbers, hand);

        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    void ex1() {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        solution(numbers, "right", "LRLLLRLLRRL");
    }

    @Test
    void ex2() {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        solution(numbers, "left", "LRLLRRLLLRR");
    }

    @Test
    void ex3() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        solution(numbers, "right", "LLRLLRLLRL");
    }
}