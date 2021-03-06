package com.mapper;

import com.entity.book;
import com.entity.bookChapters;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    int AddBook(book book);

    book IsexitsBookName(String bookName);

    int Count();

    List<book> AnyBook(int start, int pagesize);

    List<book> getBookByworker(int wid);


    int delBookInBook(int bId);

    int updateBook(book book);

    List<book> likeBook(String bookName);
}
