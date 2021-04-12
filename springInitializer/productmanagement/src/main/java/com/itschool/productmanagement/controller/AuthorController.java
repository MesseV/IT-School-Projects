package com.itschool.productmanagement.controller;

import com.itschool.productmanagement.entities.AuthorModel;
import com.itschool.productmanagement.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "author")
    public String displayAuthors (Model model) {
        List<AuthorModel> authorModelList = authorService.displayAuthors();
        model.addAttribute("title", "Afisare autori:");
        model.addAttribute("authors", authorModelList);
        return "authors";
    }

    @GetMapping(path = "add-author")
    public String addAuthor () {
        return "author-add";
    }
}
