package hello.mystudy.codingtest.programmers.wesang.task3;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

@Service
public class UsersService {

	private final OrdersService ordersService;

	public UsersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}

	public int getNumberOfItemsBought(String username) {
		Method[] methods = Item.class.getMethods();
		for (Method method : methods) {
			System.out.println("method.getName() = " + method.getName());
		}
		return ordersService.itemsBought(username).size();
	}
}
