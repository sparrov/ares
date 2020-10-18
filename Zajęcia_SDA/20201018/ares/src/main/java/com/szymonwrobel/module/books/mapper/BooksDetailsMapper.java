package com.szymonwrobel.module.books.mapper;

import com.szymonwrobel.module.books.dto.BookDetailsDto;
import com.szymonwrobel.module.books.entity.BooksDetailEntity;

public class BooksDetailsMapper {

    public static BookDetailsDto map(BooksDetailEntity details){
        if (details == null) {
            return new BookDetailsDto();
        }
        return new BookDetailsDto()
                .setIsbn(details.getIsbn())
                .setLang(details.getLang());
    }
}
