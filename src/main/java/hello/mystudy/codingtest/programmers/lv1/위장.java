package hello.mystudy.codingtest.programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class 위장 {
    public int solutionRe(String[][] clothes) {

        Map<String, Integer> clotheKindAndCounts = new HashMap<>();

        for (String[] clothe : clothes) {
            String clotheKind = clothe[1];
            if (clotheKindAndCounts.containsKey(clotheKind)) {
                Integer count = clotheKindAndCounts.get(clotheKind);
                clotheKindAndCounts.replace(clotheKind, ++count);
            } else {
                clotheKindAndCounts.put(clotheKind, 1);
            }
        }

        int result = 1;
        for (Integer count : clotheKindAndCounts.values()) {
            result *= (count + 1);
        }

        return result - 1;
    }

    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(Collectors.groupingBy(clothe -> clothe[1], Collectors.mapping(clothe -> clothe[0], Collectors.counting())))
                .values()
                .stream()
                .collect(Collectors.reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
