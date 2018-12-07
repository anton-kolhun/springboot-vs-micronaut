package com.example.dao;


import com.example.dao.entity.Book;

import javax.validation.constraints.NotBlank;
import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    Book save(@NotBlank String name);

}
