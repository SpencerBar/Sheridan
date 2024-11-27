package ca.sheridancollege.barnessp.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.barnessp.beans.Song;

@Controller
public class SongController {
	List<Song> songList = new CopyOnWriteArrayList<Song>();
//  mapping 
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("song", new Song());
		model.addAttribute("songList",songList);
		return "index";
	}
//	receiving post from form
	@PostMapping("/addSong")
	public String addSong(Model model, @ModelAttribute Song song) {
		songList.add(song);
		model.addAttribute("song",new Song());
		model.addAttribute("songList", songList);
		return "index";
	}
}
	


	
