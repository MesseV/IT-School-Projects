package com.itschool.productmanagement;

import com.itschool.productmanagement.services.AuthorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductmanagementApplication {

	ProductmanagementApplication(AuthorService authorService) {

	}

	public static void main(String[] args) {
		SpringApplication.run(ProductmanagementApplication.class, args);
	}

}
