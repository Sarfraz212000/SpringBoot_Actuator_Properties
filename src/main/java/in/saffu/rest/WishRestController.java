package in.saffu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishRestController {
	
	@GetMapping("/wish")
	public String wishMsg() {
		return "All the Best Guys..";
	}

}
