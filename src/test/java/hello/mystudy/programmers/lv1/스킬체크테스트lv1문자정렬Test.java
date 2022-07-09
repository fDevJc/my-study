package hello.mystudy.programmers.lv1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 스킬체크테스트lv1문자정렬Test {
    스킬체크테스트lv1_문자정렬 test = new 스킬체크테스트lv1_문자정렬();
    @Test
    void ex1() {
        String result = test.solution("Zbcdefg");

        Assertions.assertThat(result).isEqualTo("gfedcbZ");

    }

}