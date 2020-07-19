package com.mapper;

import com.entity.reader;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderMapper {
    reader ReaderLogin(String raccount, String rpassword);

    int AddReader(reader reader);
}
