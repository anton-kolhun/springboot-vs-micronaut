package com.example.service;


import com.example.dao.BookRepository;
import com.example.dao.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
