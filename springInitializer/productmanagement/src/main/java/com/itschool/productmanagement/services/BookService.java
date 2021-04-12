package com.itschool.productmanagement.services;

import com.itschool.productmanagement.entities.BookModel;
import com.itschool.productmanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookModel> displayBooks () {
        System.out.println("Displaying books.");
        List<BookModel> bookModelList = bookRepository.findAll();
        return bookModelList;
    }

    public void addBook (BookModel bookModel) {
        System.out.println("Adding books.");
    }
}
