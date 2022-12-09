package hello.mystudy.codingtest.programmers.lv2;

import java.util.Stack;

public class 택배상자 {
	public int solution(int[] order) {
		int answer = 0;
		Stack<Integer> stack= new Stack<>();

		for (int i = 1; i <= order.length; i++) {
			if (i == order[answer]) {
				answer++;
			} else {
				stack.add(i);
			}

			while (!stack.empty()) {
				if (stack.peek() == order[answer]) {
					stack.pop();
					answer++;
					continue;
				}
				break;
			}
		}

		return answer;
	}
}
