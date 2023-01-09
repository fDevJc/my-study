package hello.mystudy.java.functionalprogram;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class FourConsumerSample {
	public static void main(String[] args) {
		fi.accept(1, 10, (n) -> n % 2 == 0, System.out::println);
	}

	static FourConsumer<Integer,Integer, IntPredicate, IntConsumer> fi = (startNumber, endNumber, validator, action) -> {
		for (int i = startNumber; i <= endNumber; i++) {
			if (validator.test(i)) {
				action.accept(i);
			}
		}
	};
}
