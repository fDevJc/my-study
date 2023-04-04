package hello.mystudy.java.java8.stream;

import java.util.List;

import lombok.Data;

public class StreamTest1 {
	public void solution(List<StreamTest1.SampleDto> sampleDtos) {
		sampleDtos.stream()
			.filter(sampleDto -> sampleDto.getFooo().equals("test"))
			.forEach(sampleDto -> System.out.println("sampleDto.getFooo() = " + sampleDto.getFooo()));
	}

	@Data
	public static class SampleDto {
		private int foo;
		private String fooo;

		public SampleDto(int foo, String fooo) {
			this.foo = foo;
			this.fooo = fooo;
		}
	}
}
