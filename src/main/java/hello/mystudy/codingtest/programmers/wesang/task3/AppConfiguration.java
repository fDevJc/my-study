package hello.mystudy.codingtest.programmers.wesang.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codility.external")
public class AppConfiguration {

	@Bean
	public UsersService usersService(OrdersService ordersService) {
		return new UsersService(ordersService);
	}
}
