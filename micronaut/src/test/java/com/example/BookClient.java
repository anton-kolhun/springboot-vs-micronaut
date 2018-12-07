package com.example;


import com.example.dao.entity.Book;
import io.micronaut.http.client.annotation.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Nullable;
import java.util.List;

@Client("/")
public interface BookClient {

    @GetMapping("/book")
    List<Book> getAll();

    @PostMapping("/com")
    Book create(@RequestBody Book book);
}


