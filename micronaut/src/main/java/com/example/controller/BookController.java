package com.example.controller;

import com.example.dao.entity.Book;
import com.example.service.BookService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.AllArgsConstructor;

import java.util.List;


@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;


    @Get("/book")
    public List<Book> getAllBooks() {
        return bookService.findBooks();
    }

    @Post("/book")
    public Book createBookn(Book book) {
        return bookService.createBook(book.getName());
    }

}