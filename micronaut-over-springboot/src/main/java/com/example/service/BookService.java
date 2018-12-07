package com.example.service;


import com.example.dao.BookRepository;
import com.example.dao.entity.Book;
import io.micronaut.spring.tx.annotation.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
