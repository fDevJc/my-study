package hello.mystudy.java.functionalprogram;

import java.util.function.IntPredicate;

// a ~ b 사이의 짝수의 값을 구하시오
public class ThreeConsumerSample {
	public static void main(String args[]) {
		fori.accept(1, 10, (i) -> i % 2 == 0);
	}

	static ThreeConsumer<Integer, Integer, IntPredicate> fori = (startNumb, endNumb, validator) -> {
		for (int i = startNumb; i <= endNumb; i++) {
			if (validator.test(i)) {
				System.out.println("i = " + i);
			}
		}
	};

}
