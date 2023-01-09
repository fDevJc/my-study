package hello.mystudy.java.functionalprogram;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class CurryingSample {
	public static void main(String[] args) {
		IntConsumer printer = System.out::println;
		IntPredicate isEven = (n) -> n % 2 == 0;

		curryFor.apply(printer)
			.apply(isEven)
			.accept(1, 10);

	}

	static Function<IntConsumer, Function<IntPredicate, BiConsumer<Integer, Integer>>> curryFor = (action) -> (predicate) -> (startNumber, endNumber) -> {
		for (int i = startNumber; i <= endNumber; i++) {
			if (predicate.test(i)) {
				action.accept(i);
			}
		}
	};
}
