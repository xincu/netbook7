package com.serviceImpl;

import com.entity.gmer;
import com.mapper.GmerMapper;
import com.service.GmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GmerServiceImpl  implements GmerService {
    @Autowired
    private GmerMapper gmerMapper;
    @Override
    public gmer GmerLogin(String gaccount, String gpassword) {
        return gmerMapper.GmerLogin(gaccount,gpassword);
    }

    @Override
    public int AddGmer(gmer gmer) {
        return gmerMapper.AddGmer(gmer);


    }
}
