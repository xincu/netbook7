package com.serviceImpl;

import com.entity.reader;
import com.mapper.ReaderMapper;
import com.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService  {
   @Autowired
     private  ReaderMapper readerMapper;
    @Override
    public reader ReaderLogin(String raccount, String rpassword) {
        return readerMapper.ReaderLogin(raccount,rpassword);
    }

    @Override
    public int AddReader(reader reader) {
        return readerMapper.AddReader(reader);
    }

    @Override
    public reader IsexitsAccount(String raccount) {
        return readerMapper.IsexitsAccount(raccount);
    }

    @Override
    public reader IsexitsName(String rname) {
        return readerMapper.IsexitsName(rname);
    }

    @Override
    public List<reader> AllReader() {
        return readerMapper.AllReader();
    }
}
