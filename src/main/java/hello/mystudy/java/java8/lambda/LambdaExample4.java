package hello.mystudy.java.java8.lambda;

import java.util.function.Consumer;

public class LambdaExample4 {
	public static void main(String[] args) {
		Consumer consumer = o -> System.out.println("o = " + o);

		consumer.accept(1);
	}
}
