package com.service;

import com.entity.reader;

import java.util.List;

public interface ReaderService {
    reader ReaderLogin(String raccount, String rpassword);

    int AddReader(reader reader);

    reader IsexitsAccount(String raccount);

    reader IsexitsName(String rname);

    List<reader> AllReader();
}
