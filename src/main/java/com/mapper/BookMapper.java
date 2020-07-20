package com.mapper;

import com.entity.book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    int AddBook(book book);

    book IsexitsBookName(String bookName);
}
