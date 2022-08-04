package hello.mystudy.codingtest.programmers.lv1;

import hello.mystudy.codingtest.programmers.lv1.스킬체크테스트lv1_요일찾기;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 스킬체크테스트lv1요일찾기Test {
    스킬체크테스트lv1_요일찾기 test = new 스킬체크테스트lv1_요일찾기();
    @Test
    void ex1() {
        String result = test.solution(5, 24);

        Assertions.assertThat(result).isEqualTo("TUE");

    }
}