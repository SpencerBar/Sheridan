package ca.sheridancollege.barnessp.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.barnessp.beans.Game;

@Controller
public class GamesController {
	// creating a array list to hold games
	List<Game> gameList = new CopyOnWriteArrayList<Game>();
	
	// mapping index with our game pojo
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("game", new Game());
		model.addAttribute("gameList", gameList);
		return "index";
	}
	
	// receiving the forms and adding it to our games list
	@PostMapping("/addGame")
	public String addGame(Model model, @ModelAttribute Game game) {
		gameList.add(game);
		model.addAttribute("game", new Game());
		model.addAttribute("gameList", gameList);
		return "index";
	}
}
