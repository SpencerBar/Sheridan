package ca.sheridancollege.barnessp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.bean.TheatreReservation;
import ca.sheridancollege.barnessp.database.DatabaseAccess;

@Controller
public class HomeController {
	
	@Autowired 
	private DatabaseAccess da; 

	@GetMapping("/")
	public String index(Model model) {
		da.insertMovie();
		model.addAttribute("TheatreReservation", new TheatreReservation());
		model.addAttribute("TheatreReservationList", da.getRes());
		return "index";
	}
	@GetMapping("/search")
	public String searchRes(Model model) {
	model.addAttribute("TheatreReservation", new TheatreReservation());
	model.addAttribute("TheatreReservationList", da.getRes());
		return "search";
	}
	@GetMapping("/deleteRes/{id}") 
	public String deleteRes(Model model, @PathVariable Long id) { 
		model.addAttribute("TheatreReservation", new TheatreReservation()); 
		model.addAttribute("TheatreReservationList", da.getRes());
		da.deleteRes(id); 
		return "search"; 

	} 
	@PostMapping("/searchRes")
	public String searchRes(Model model, @RequestParam String genre) {
		model.addAttribute("TheatreReservation", new TheatreReservation());
		model.addAttribute("TheatreReservationList", da.getRes());
		model.addAttribute("TheatreReservationList", da.getResbyGenre(genre));
		return "search";
	}
}
