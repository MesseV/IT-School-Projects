package com.itschool.productmanagement.services;

import com.itschool.productmanagement.entities.AuthorModel;
import com.itschool.productmanagement.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Component
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

     @GetMapping(path = "authors")
     public List<AuthorModel> displayAuthors () {
         System.out.println("Displaying authors.");
         List<AuthorModel> authors = authorRepository.findAll();
         return authors;
     }

     @GetMapping(path = "author-add")
     public void addAuthor (AuthorModel author) {
         authorRepository.save(author);
     }

     public void deleteById (int id) {
         authorRepository.deleteById(id);
     }

     public AuthorModel findById(int id) {
         Optional<AuthorModel> optionalAuthorModel = authorRepository.findById(id);
         return optionalAuthorModel.get();
     }

}
