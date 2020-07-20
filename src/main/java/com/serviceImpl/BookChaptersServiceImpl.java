package com.serviceImpl;

import com.entity.book_chapters;
import com.mapper.BookChaptersMapper;
import com.service.BookChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookChaptersServiceImpl implements BookChaptersService {
    @Autowired
    private BookChaptersMapper bookChaptersMapper;
    @Override
    public int AddChapters(book_chapters bookChapters) {
        return bookChaptersMapper.AddChapters(bookChapters);
    }
}
