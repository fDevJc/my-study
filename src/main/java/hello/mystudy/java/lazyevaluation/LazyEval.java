package hello.mystudy.java.lazyevaluation;

import java.util.function.Supplier;

public class LazyEval {

	public String run1(String s1, String s2) {
		//eager evaluation
		boolean result1 = compute(s1);
		boolean result2 = compute(s2);

		return result1 && result2 ? "true!!" : "false!!";
	}

	public String run2(String s1, String s2) {
		//lazy evaluation
		return compute(s1) && compute(s2) ? "true!!" : "false!!";
	}

	public String run3(String s1, String s2) {
		//after java8 use Supplier
		Supplier<Boolean> result1 = () -> compute(s1);
		Supplier<Boolean> result2 = () -> compute(s2);

		return result1.get() && result2.get() ? "true!!" : "false!!";
	}

	private boolean compute(String str) {
		System.out.println("compute exec : str = " + str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return str.contains("a");
	}
}
