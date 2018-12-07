package com.example.controller;

import com.example.dao.entity.Book;
import com.example.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;


    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book greeting) {
        return bookService.createBook(greeting.getName());
    }

}