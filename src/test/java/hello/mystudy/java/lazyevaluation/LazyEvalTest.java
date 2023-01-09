package hello.mystudy.java.lazyevaluation;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LazyEvalTest {
	@Test
	void test1() {
		LazyEval test = new LazyEval();
		long startTime = System.currentTimeMillis();
		String result = test.run1("bb", "aa");
		long endTime = System.currentTimeMillis();

		System.out.println("time = " + (endTime - startTime));

		assertThat(result).isEqualTo("false!!");

	}

	@Test
	void test2() {
		LazyEval test = new LazyEval();
		long startTime = System.currentTimeMillis();
		String result = test.run2("bb", "aa");
		long endTime = System.currentTimeMillis();

		System.out.println("time = " + (endTime - startTime));

		assertThat(result).isEqualTo("false!!");

	}

	@Test
	void test3() {
		LazyEval test = new LazyEval();
		long startTime = System.currentTimeMillis();
		String result = test.run2("bb", "aa");
		long endTime = System.currentTimeMillis();

		System.out.println("time = " + (endTime - startTime));

		assertThat(result).isEqualTo("false!!");

	}

}