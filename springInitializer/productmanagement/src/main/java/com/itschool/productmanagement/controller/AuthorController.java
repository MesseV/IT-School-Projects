package com.itschool.productmanagement.controller;

import com.itschool.productmanagement.entities.AuthorModel;
import com.itschool.productmanagement.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "author")
    public String displayAuthors (Model model) {
        List<AuthorModel> authorModelList = authorService.displayAuthors();
        model.addAttribute("authors", authorModelList);
        return "authors";
    }

    @GetMapping(path = "add-author")
    public String viewAuthorPage (Model model) {
        model.addAttribute("NewAuthor", new AuthorModel());
        return "author-add";
    }

    @GetMapping(path = "author-add")
    public String addAuthor (@ModelAttribute AuthorModel newAuthor){
        System.out.println("Add author -> " + newAuthor.getFirstName() + " " + newAuthor.getLastName());
        authorService.addAuthor(newAuthor);
        return "redirect:/author";
    }

    @GetMapping(path = "deleteById")
    public String deleteById(@RequestParam("id") int id){
        System.out.println("Deleting author with id: " + id);
        authorService.deleteById(id);
        return "redirect:/author";
    }

    @GetMapping(path = "findById")
    public String findById(@RequestParam("id") int id, Model model) {
        System.out.println("Viewing details by id");
        AuthorModel authorModel = authorService.findById(id);
        model.addAttribute("foundAuthor", authorModel);
        return "view-author";
    }

}
