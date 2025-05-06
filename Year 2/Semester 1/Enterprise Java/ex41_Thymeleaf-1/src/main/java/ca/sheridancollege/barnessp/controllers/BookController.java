package ca.sheridancollege.barnessp.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.barnessp.beans.Book;

@Controller
public class BookController {
	List<Book> bookList = new CopyOnWriteArrayList<Book>();

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("bookList", bookList);
		return "index";
	}
	@PostMapping("/addBook")
	public String addBook(Model model,
			@RequestParam Long isbn,
			@RequestParam String bookName,
			@RequestParam String author) {
		
		Book book = new Book(bookName, isbn, author);
		bookList.add(book);
		model.addAttribute("bookList", bookList);
		return "index";
		
	}
}
