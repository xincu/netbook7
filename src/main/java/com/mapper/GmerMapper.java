package com.mapper;

import com.entity.gmer;
import org.springframework.stereotype.Repository;

@Repository

public interface GmerMapper {
    gmer GmerLogin(String gaccount, String gpassword);

    int AddGmer(gmer gmer);
}
