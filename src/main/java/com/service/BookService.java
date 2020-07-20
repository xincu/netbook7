package com.service;

import com.entity.book;
import com.entity.bookChapters;

import java.util.List;

public interface BookService {
    List<book> AnyBook(int pageNum);

    int AddBook(book book);

    book IsexitsBookName(String bookName);

    int AddChaptersByWorker(bookChapters bookChapters);

    List<bookChapters> showVia();

    List<bookChapters> showSubmit();

    List<bookChapters> showWorker(int bWid);
}
