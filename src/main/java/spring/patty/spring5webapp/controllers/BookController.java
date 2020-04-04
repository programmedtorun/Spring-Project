package spring.patty.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.patty.spring5webapp.repositories.BookRepository;

/**
 * Created by patrickskelley on Apr, 2020
 */

@Controller
public class BookController {

    // using spring dependency injection adding BookRepo
    private final BookRepository bookRepository;

    // when spring instantiates this it will inject an instance of bookRepo into controller
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // at run time when spring gets a request to url /books it will execute the getBooks method
    // and provide a model obj
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());


        return "books";
    }
}
