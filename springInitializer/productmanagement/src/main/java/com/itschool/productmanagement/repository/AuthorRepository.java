package com.itschool.productmanagement.repository;

import com.itschool.productmanagement.entities.AuthorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, Integer> {



}
