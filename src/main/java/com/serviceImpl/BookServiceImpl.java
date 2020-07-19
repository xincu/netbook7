package com.serviceImpl;

import com.entity.book;
import com.mapper.BookMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public int AddBook(book book) {

        return bookMapper.AddBook(book) ;
    }
}
