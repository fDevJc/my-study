package hello.mystudy.codingtest.programmers.lv2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 이중우선순위큐 {
	public int[] solution(String[] operations) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < operations.length; i++) {
			String operation = operations[i].substring(0, 1);
			int number = Integer.parseInt(operations[i].substring(1).trim());
			if ("I".equals(operation)) {
				queue.add(number);
			} else if ("D".equals(operation)) {
				if (queue.size() == 0) {
					continue;
				}
				if (number == 1) {
					queue.remove(Collections.max(queue));
				} else if (number == -1) {
					queue.remove(Collections.min(queue));
				}
			}
		}
		int[] answer = {0, 0};
		if (queue.size() > 0) {
			answer = new int[] {Collections.max(queue), Collections.min(queue)};
		}
		return answer;
	}
}
