package hello.mystudy.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 스킬체크테스트lv1문제1요일찾기Test {
    스킬체크테스트lv1문제1_요일찾기 test = new 스킬체크테스트lv1문제1_요일찾기();
    @Test
    void ex1() {
        String result = test.solution(5, 24);

        Assertions.assertThat(result).isEqualTo("TUE");

    }
}