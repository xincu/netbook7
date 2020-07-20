package com.service;

import com.entity.book;

public interface BookService {
    int AddBook(book book);

    book IsexitsBookName(String bookName);
}
