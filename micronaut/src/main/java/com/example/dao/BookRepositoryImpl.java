package com.example.dao;

import com.example.dao.entity.Book;
import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Singleton // <1>
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext
    private EntityManager entityManager;  // <2>

    public BookRepositoryImpl(@CurrentSession EntityManager entityManager) { // <2>
        this.entityManager = entityManager;
    }

    @Override
    @Transactional // <4>
    public Book save(@NotBlank String name) {
        Book book = new Book(name);
        entityManager.persist(book);
        return book;
    }


    @Override
    public List<Book> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Book.class);
        return criteria.list();
    }
}
