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
   /*管理员登录*/
    @Override
    public gmer GmerLogin(String gaccount, String gpassword) {
        return gmerMapper.GmerLogin(gaccount,gpassword);
    }
/*管理注册*/
    @Override
    public int AddGmer(gmer gmer) {
        return gmerMapper.AddGmer(gmer);
    }
    /*账号重复判断*/
    @Override
    public gmer IsexistAccount(String gaccount) {
        return gmerMapper.IsexistAccount(gaccount);
    }
    /*称呼重名判断*/
    @Override
    public gmer IsexistName(String gname) {
        return gmerMapper.IsexistName(gname);
    }


}
