package com.szymonwrobel.module.books.entity;

import javax.persistence.*;

@Entity
@Table(name="books_details")
public class BooksDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;
    private String lang;
    private String publisher;

    public Long getId() {
        return id;
    }

    public BooksDetailEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public BooksDetailEntity setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public BooksDetailEntity setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public BooksDetailEntity setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
}
