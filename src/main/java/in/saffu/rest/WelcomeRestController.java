package in.saffu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	 
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to my rest controller";
	}

}
