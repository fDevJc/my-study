package hello.mystudy.spring.registerbean;

import org.springframework.stereotype.Component;

@Component
public class SampleComponent {
	public void sample(String location) {
		System.out.println("sampleComponent called by" + location);
	}
}
