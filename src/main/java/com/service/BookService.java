package com.service;

import com.entity.book;

import java.util.List;

public interface BookService {
    List<book> AnyBook(int pageNum);

    int AddBook(book book);

    book IsexitsBookName(String bookName);
}
