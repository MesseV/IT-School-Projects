package com.itschool.productmanagement.repository;

import com.itschool.productmanagement.entities.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Integer> {



}
