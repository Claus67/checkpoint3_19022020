package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String goToGetAllBooks() {
		return "redirect:/books";
	}
	
	@GetMapping("/books")
	public String getAllBooks(Model model) {
		return "books";
	}
	
	@GetMapping("/book")
	public String getBook(Model model) {
		return "book";
	}
	
	@PostMapping("/save")
	public String saveBook(Model model) {
		return "redirect:/book";
	}
}
