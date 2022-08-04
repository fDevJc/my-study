package hello.mystudy.codingtest.programmers.lv1;

import hello.mystudy.codingtest.programmers.lv1.숫자문자열과영단어;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class 숫자문자열과영단어Test {
    숫자문자열과영단어 test = new 숫자문자열과영단어();

    @Test
    void ex1() {
        String s = "one4seveneight";
        int result = test.solution(s);
        Assertions.assertThat(result).isEqualTo(1478);
    }

    @Test
    void ex2() {
        String s = "23four5six7";
        int result = test.solution(s);
        Assertions.assertThat(result).isEqualTo(234567);
    }

    @Test
    void ex3() {
        String s = "2three45sixseven";
        int result = test.solution(s);
        Assertions.assertThat(result).isEqualTo(234567);
    }

    @Test
    void ex4() {
        String s = "123";
        int result = test.solution(s);
        Assertions.assertThat(result).isEqualTo(123);
    }

}