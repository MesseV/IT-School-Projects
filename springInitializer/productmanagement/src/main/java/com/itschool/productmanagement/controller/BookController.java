package com.itschool.productmanagement.controller;

import com.itschool.productmanagement.entities.BookModel;
import com.itschool.productmanagement.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String displayBooks (Model model) {
        List<BookModel> bookModelList = bookService.displayBooks();
        model.addAttribute("Title", "Afisare carti.");
        model.addAttribute("books", bookModelList);
        return "list-book";
    }
}
