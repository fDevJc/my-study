package hello.mystudy.java.java8.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class StreamTest1Test {

	@Test
	void test() throws Exception {
		StreamTest1 test = new StreamTest1();
		test.solution(List.of(new StreamTest1.SampleDto(1, "test"), new StreamTest1.SampleDto(2, "test1")));

	}
}