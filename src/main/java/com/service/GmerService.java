package com.service;

import com.entity.gmer;

public interface GmerService {
    gmer GmerLogin(String gaccount, String gpassword);

    int AddGmer(gmer gmer);
}
