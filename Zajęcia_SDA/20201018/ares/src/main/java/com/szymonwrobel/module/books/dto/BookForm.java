package com.szymonwrobel.module.books.dto;

import java.util.List;

public class BookForm {
    private String author;
    private String title;
    private String isbn;
    private String lang;
    private List<String> tags;

    public List<String> getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getLang() {
        return lang;
    }
}
