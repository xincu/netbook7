package com.mapper;

import com.entity.book_chapters;
import org.springframework.stereotype.Repository;

@Repository
public interface BookChaptersMapper {
    int AddChapters(book_chapters bookChapters);
}
