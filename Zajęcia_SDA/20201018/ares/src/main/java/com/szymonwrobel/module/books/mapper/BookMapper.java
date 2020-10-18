package com.szymonwrobel.module.books.mapper;

import com.szymonwrobel.module.books.dto.BookDto;
import com.szymonwrobel.module.books.entity.BooksEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {
    public static BookDto map(BooksEntity entity) {
        return new BookDto()
                .setId(entity.getId())
                .setAuthor(entity.getAuthor())
                .setTitle(entity.getTitle())
                .setDetails(BooksDetailsMapper.map(entity.getDetails()))
                .setTags(BooksTagMapper.map(entity.getTags()));
    }

    public static List<BookDto> map(List<BooksEntity> entities) {
        return entities
                .stream()
                .map(BookMapper::map)
                .collect(Collectors.toList());
    }
}
