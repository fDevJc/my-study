package hello.mystudy.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 요일찾기Test {
    요일찾기 test = new 요일찾기();
    @Test
    void ex1() {
        String result = test.solution(5, 24);

        Assertions.assertThat(result).isEqualTo("TUE");

    }
}