package hello.mystudy.codingtest.programmers.lv1;

import hello.mystudy.codingtest.programmers.lv1.스킬체크테스트lv1_문자정렬;
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