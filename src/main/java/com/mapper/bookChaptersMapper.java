package com.mapper;

import com.entity.bookChapters;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookChaptersMapper {
    int AddChaptersByWorker(bookChapters bookChapters);

    List<bookChapters> showVia();

    List<bookChapters> showSubmit();

    List<bookChapters> showWorker(int bWid);
}
