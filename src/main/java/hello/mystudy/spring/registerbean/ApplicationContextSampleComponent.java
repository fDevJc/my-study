package hello.mystudy.spring.registerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextSampleComponent {
	private final ApplicationContext applicationContext;

	public ApplicationContextSampleComponent(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public void sample() {
		SampleComponent bean = applicationContext.getBean(SampleComponent.class);
		System.out.println("bean = " + bean);
		bean.sample("noBean");
	}

}
