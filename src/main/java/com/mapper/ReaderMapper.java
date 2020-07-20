package com.mapper;

import com.entity.reader;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderMapper {
    reader ReaderLogin(String raccount, String rpassword);

    int AddReader(reader reader);

    reader IsexitsAccount(String raccount);

    reader IsexitsName(String rname);

    List<reader> AllReader();
}
