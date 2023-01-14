package hello.mystudy.java.java8.lambda;

import java.util.function.Consumer;

public class LambdaExample3 {
	public static void main(String[] args) {
		String str = "hi";
		int i = 1;

		foo().accept(str);
		foo().accept(i);
	}

	public static Consumer foo() {
		return (str) -> System.out.println(str);
	}
}
