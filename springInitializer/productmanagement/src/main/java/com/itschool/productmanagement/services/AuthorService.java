package com.itschool.productmanagement.services;

import com.itschool.productmanagement.entities.AuthorModel;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {


     public void displayAuthors () {
         System.out.println("Displaying authors.");
     }

     public void addAuthor (AuthorModel author) {
         System.out.println("Adding authors to database.");
     }

}
