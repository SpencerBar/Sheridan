package ca.sheridancollege.barnessp.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.database.DatabaseAccess;

@Controller
public class HomeController {
	@Autowired
	DatabaseAccess da;
	
	   @InitBinder
	    public void initBinder(WebDataBinder binder) {
	        // The date format used in the <input type="date"> field
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	    }
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("availSessionList", da.getAvailable());
		model.addAttribute("sessionList", da.getAll());
		model.addAttribute("ReservationList", da.getRes());
		return "admin/index";
	}

	@PostMapping("/reserveSession")
	public String reserve(Model model,@RequestParam Long sessionNo,@RequestParam Date date,@RequestParam String email) {
		model.addAttribute("availSessionList", da.getAvailable());
		model.addAttribute("sessionList", da.getAll());
		da.addReservation(sessionNo,date,email);
		model.addAttribute("ReservationList", da.getRes());
		return "admin/index";
		
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/logout")
	public String loguot() {
		return "logout";
	}
	@GetMapping("/permission-denied")
	public String permissionDenied() {
	return "/permission-denied";
	}
}
