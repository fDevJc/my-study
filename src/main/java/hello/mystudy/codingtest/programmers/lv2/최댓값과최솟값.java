package hello.mystudy.codingtest.programmers.lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 최댓값과최솟값 {
	public String solution(String s) {
		List<Integer> numbers = Arrays.stream(s.split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
		return String.format("%d %d", Collections.min(numbers), Collections.max(numbers));
	}
}
