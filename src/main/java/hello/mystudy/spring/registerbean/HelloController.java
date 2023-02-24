package hello.mystudy.spring.registerbean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final SampleComponent sampleComponent;
	private final ApplicationContextSampleComponent applicationContextSampleComponent;

	public HelloController(SampleComponent sampleComponent, ApplicationContextSampleComponent applicationContextSampleComponent) {
		this.sampleComponent = sampleComponent;
		this.applicationContextSampleComponent = applicationContextSampleComponent;
	}

	@GetMapping("/hello")
	public String hello() {
		sampleComponent.sample("controller");
		applicationContextSampleComponent.sample();
		return "hello";
	}
}
