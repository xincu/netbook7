package com.mapper;

import com.entity.bookChapters;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookChaptersMapper {
    int AddChaptersByWorker(bookChapters bookChapters);

    List<bookChapters> showVia(int bId);

    List<bookChapters> showSubmit();

    List<bookChapters> showWorker(int bWid);

    int Count(int bId);

    List<bookChapters> Anychapters(int start, int pageSize, int bId);

    int AuditChapters(int bcId, int bcStateId);

    int updateChapters(bookChapters bookChapters);
}
