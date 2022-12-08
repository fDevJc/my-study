package hello.mystudy.codingtest.programmers.lv2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 귤고르기 {
	public int solution(int k, int[] tangerine) {
		int answer = 0;

		Map<Integer, Integer> tangerineCountBySize = new HashMap<>();

		for (int i = 0; i < tangerine.length; i++) {
			int tangerineSize = tangerine[i];
			tangerineCountBySize.put(tangerineSize, tangerineCountBySize.getOrDefault(tangerineSize, 0) + 1);
		}

		int sum = 0;

		List<Integer> collect = tangerineCountBySize.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		for (Integer integer : collect) {
			if (sum >= k)
				break;
			answer++;
			sum += integer;
		}

		return answer;
	}
}
