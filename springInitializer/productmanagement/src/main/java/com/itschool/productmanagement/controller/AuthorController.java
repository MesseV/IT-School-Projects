package com.itschool.productmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    @GetMapping(path = "author")
    public String displayAuthors () {
        return "authors";
    }

    @GetMapping(path = "add-author")
    public String addAuthor () {
        return "author-add";
    }
}
