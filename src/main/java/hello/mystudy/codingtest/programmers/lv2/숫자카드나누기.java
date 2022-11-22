package hello.mystudy.codingtest.programmers.lv2;

public class 숫자카드나누기 {
	public int solution(int[] arrayA, int[] arrayB) {
		int gcdA = getGCD(arrayA);
		int gcdB = getGCD(arrayB);

		if (gcdA != 1 && !isCd(gcdA, arrayB)) {
			return Integer.max(gcdA, gcdB);
		}

		if (gcdB != 1 && !isCd(gcdB, arrayA)) {
			return Integer.max(gcdA, gcdB);
		}
		return 0;
	}

	private boolean isCd(int numb, int[] numbers) {
		for (int number : numbers) {
			if (number % numb == 0) {
				return true;
			}
		}
		return false;
	}

	private int getGCD(int[] numbers) {
		if (numbers.length == 1) {
			return numbers[0];
		}
		int gcdNumber = gcd(numbers[0], numbers[1]);
		for (int i = 2; i < numbers.length; i++) {
			gcdNumber = gcd(gcdNumber, numbers[i]);
		}
		return gcdNumber;
	}

	private int gcd(int number1, int number2) {
		while (number1 > 0) {
			int tmp = number2 % number1;
			number2 = number1;
			number1 = tmp;
		}
		return number2;
	}
}
