package hello.mystudy.codingtest.programmers.lv2;

import hello.mystudy.codingtest.programmers.lv2.MunjayulApchuk;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MunjayulApchukTest {
    MunjayulApchuk test = new MunjayulApchuk();

    @Test
    void ex1() {
        assertSolution("aabbaccc", "2a2ba3c", 7);
    }

    @Test
    void ex2() {
        assertSolution("ababcdcdababcdcd", "2ababcdcd", 9);
    }

    @Test
    void ex3() {
        assertSolution("abcabcdede", "2abcdede", 8);
    }

    @Test
    void ex4() {
        assertSolution("abcabcabcabcdededededede", "2abcabc2dedede", 14);
    }

    @Test
    void ex5() {
        assertSolution("xababcdcdababcdcd", "xababcdcdababcdcd", 17);
    }

    private void assertSolution(String input, String expectedOutput, int expectedOutputStringCount) {
        assertThat(test.solutionDesc(input)).isEqualTo(expectedOutput);
        assertThat(test.solution(input)).isEqualTo(expectedOutputStringCount);
    }
}