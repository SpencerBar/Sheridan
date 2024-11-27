package ca.sheridancollege.barnessp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.database.DatabaseAccess;
@Controller
public class HomeController {
	@Autowired
	@Lazy
	private DatabaseAccess da;

	@GetMapping("/")
	public String index() {
	return "index";
	}
	@GetMapping("/secure")
	public String secureIndex() {
	return "/secure/index";
	}
	@GetMapping("/login")
	public String login() {
	return "login";
	}
	@GetMapping("/permission-denied")
	public String permissionDenied() {
	return "/error/permission-denied";
	}
	
	@GetMapping("/register")
	public String AcctRegistration() {
		return "register";
	}
	@PostMapping("/register")
	public String postRegister(@RequestParam String username, @RequestParam String password) {
		da.addUser(username, password);
		Long userId = da.findUserAccount(username).getUserId();
		da.addRole(userId, Long.valueOf(1));
	return "redirect:/";
	}


}
