package com.example.springboottest.controller;

import com.example.springboottest.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboottest.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookHandler {
    @Autowired
   private BookRepository bookRepository;
    @GetMapping("/findAll")
    public List<Book>findAll(){
        return bookRepository.findAll();

    }

}
