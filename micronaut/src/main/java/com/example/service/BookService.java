package com.example.service;


import com.example.dao.BookRepository;
import com.example.dao.entity.Book;
import io.micronaut.spring.tx.annotation.Transactional;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;
import java.util.List;


@Singleton
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public Book createBook(String name) {
        return bookRepository.save(name);
    }

}
