package hello.mystudy.java.java8.stream;

import java.util.List;

import lombok.Data;

public class IntStream {
	public int solution(List<SampleDto> sampleDtos) {
		return sampleDtos.stream()
			.mapToInt(SampleDto::getFoo)
			.sum();
	}

	@Data
	public static class SampleDto {
		private int foo;

		public SampleDto(int foo) {
			this.foo = foo;
		}
	}
}
