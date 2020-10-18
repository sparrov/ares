package com.szymonwrobel.module.books.mapper;

import com.szymonwrobel.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BooksTagMapper {
    public static String map(BooksTagsEntity tag) {
        return tag.getValue();
    }

    public static Set<String> map(Set<BooksTagsEntity> tags){
        if (tags == null) {
            return Set.of();
        }
        return  tags
                .stream()
                .map(BooksTagMapper::map)
                .collect(Collectors.toSet());
    }
}
