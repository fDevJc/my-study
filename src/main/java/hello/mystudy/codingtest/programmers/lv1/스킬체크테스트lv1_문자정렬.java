package hello.mystudy.codingtest.programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 스킬체크테스트lv1_문자정렬 {
    public String solution(String s) {
        String[] result = s.split("");
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).collect(Collectors.joining());
    }
}
