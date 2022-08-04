package hello.mystudy.codingtest.programmers.lv1;

import hello.mystudy.codingtest.programmers.lv1.위장;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 위장Test {
    위장 test = new 위장();

    @Test
    void ex1() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = test.solution(clothes);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void ex2() {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int result = test.solution(clothes);
        assertThat(result).isEqualTo(3);
    }
}