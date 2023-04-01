package hello.mystudy.java.java8.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class IntStreamTest {
	@Test
	void test() throws Exception {
		IntStream intStream = new IntStream();

		int solution = intStream.solution(List.of(new IntStream.SampleDto(1), new IntStream.SampleDto(3)));

		Assertions.assertThat(solution).isEqualTo(4);
	}

}