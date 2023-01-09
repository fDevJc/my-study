package hello.mystudy.codingtest.programmers.lv3;

public class 숫자타자대회 {
	public int solution(String numbers) {
		int answer = 0;
		int[][] numberPad = new int[4][3];

		setNumberPad(numberPad);



		return answer;
	}

	private static void setNumberPad(int[][] numberPad) {
		numberPad[3][1] = 0;
		int a = 0;
		int b = 0;

		for (int i = 1; i < 10; i++) {
			numberPad[a][b] = i;
			b++;
			if (i % 3 == 0) {
				b = 0;
				a++;
			}
		}
	}
}
