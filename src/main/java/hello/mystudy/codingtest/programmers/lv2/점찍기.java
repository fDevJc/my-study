package hello.mystudy.codingtest.programmers.lv2;

public class 점찍기 {
	public long solution(int k, int d) {
		long answer = 0;

		double dPow = Math.pow(d, 2);

		for (int i = 0; i <= d; i += k) {
			double dd = Math.floor(Math.sqrt(dPow - Math.pow(i, 2))) / k + 1;
			answer += dd;
		}

		return answer;
	}

	public long solution2(int k, int d) {
		long answer = 1;
		double dPow = Math.pow(d, 2);
		for (int i = k; i <= d; i += k) {
			for (int j = 0; j < i; j += k) {
				double iPow = Math.pow(i, 2);
				double jPow = Math.pow(j, 2);
				if (iPow + jPow <= dPow) {
					answer += 2;
					continue;
				}
				break;
			}
			if (Math.pow(i, 2) * 2 <= dPow) {
				answer++;
			}
		}
		return answer;
	}
}
