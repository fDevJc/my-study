package hello.mystudy.codingtest.programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(0, "zero");
        numberMap.put(1, "one");
        numberMap.put(2, "two");
        numberMap.put(3, "three");
        numberMap.put(4, "four");
        numberMap.put(5, "five");
        numberMap.put(6, "six");
        numberMap.put(7, "seven");
        numberMap.put(8, "eight");
        numberMap.put(9, "nine");

        String result = s;
        for (Integer integer : numberMap.keySet()) {
            result = result.replaceAll(numberMap.get(integer), String.valueOf(integer));
        }

        return Integer.parseInt(result);
    }


}
