package hello.mystudy.codingtest.programmers.wesang.task3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	private final UsersService usersService;

	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/users/{username}/items/total")
	public Map<String, Integer> totalItemsBought(
		@PathVariable("username") String username
	) {
		int numberOfItemsBought = usersService.getNumberOfItemsBought(username);

		Map<String, Integer> response = new HashMap<>();
		response.put("totalItemsBought", numberOfItemsBought);
		return response;
	}
}
