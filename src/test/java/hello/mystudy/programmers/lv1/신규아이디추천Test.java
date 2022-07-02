package hello.mystudy.programmers.lv1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static hello.mystudy.programmers.lv1.신규아이디추천.*;
import static org.assertj.core.api.Assertions.assertThat;

class 신규아이디추천Test {

    신규아이디추천 test = new 신규아이디추천();

    @Test
    void ex1() {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String expected = "bat.y.abcdefghi";
        testId(new_id, expected);
    }

    @Test
    void ex2() {
        String new_id = "z-+.^.";
        String expected = "z--";
        testId(new_id, expected);
    }

    @Test
    void ex3() {
        String new_id = "=.=";
        String expected = "aaa";
        testId(new_id, expected);
    }

    @Test
    void ex4() {
        String new_id = "123_.def";
        String expected = "123_.def";
        testId(new_id, expected);
    }

    @Test
    void ex5() {
        String new_id = "abcdefghijklmn.p";
        String expected = "abcdefghijklmn";
        testId(new_id, expected);
    }

    @Test
    void letterRemoverTest() {
        String input = ".!";

        List<String> patterns = new ArrayList<>();
        patterns.add("[a-z]");
        patterns.add("[0-9]");
        patterns.add("-");
        patterns.add("_");
        patterns.add("\\.");

        LetterRemover remover = new LetterRemover(patterns);
        String result = remover.convert(input);

        assertThat(result).isEqualTo(".");
    }

    @Test
    void removeDuplicateLetter() {
        List<String> toRemoveList = new ArrayList<>();
        toRemoveList.add(".");

        DuplicateLettersRemover remover = new DuplicateLettersRemover(toRemoveList);

        String input = "..1...2....3........";
        String result = remover.convert(input);

        System.out.println("result = " + result);
        assertThat(result).isEqualTo(".1.2.3.");


    }

    @Test
    void firstAndLastLetterRemoverTest() {
        FirstAndLastLetterRemover remover = new FirstAndLastLetterRemover(".");

        String input = ".12.";
        String result = remover.convert(input);

        assertThat(result).isEqualTo("12");
    }

    @Test
    void emptyLetterConverterTest() {
        EmptyLetterConverter converter = new EmptyLetterConverter("a");
        String input = "";
        String result = converter.convert(input);
        assertThat(result).isEqualTo("a");
    }

    @Test
    void maxLengthRemoverTest() {
        MaxLengthRemover remover = new MaxLengthRemover(3);
        String input = "aaaa";
        String result = remover.convert(input);
        assertThat(result).isEqualTo("aaa");
    }
    
    @Test
    void minLengthMakerTest() {
        MinLengthMaker maker = new MinLengthMaker(3);
        String input = "aa";
        String result = maker.convert(input);
        assertThat(result).isEqualTo("aaa");
    }
    private void testId(String new_id, String expected) {
        String result = test.solution(new_id);
        assertThat(result).isEqualTo(expected);
    }
}