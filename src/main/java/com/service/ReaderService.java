package com.service;

import com.entity.reader;

public interface ReaderService {
    reader ReaderLogin(String raccount, String rpassword);

    int AddReader(reader reader);
}
