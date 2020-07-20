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

    @Override
    public int DelReader(int rid) {
        return readerMapper.DelReader(rid);
    }

    @Override
    public List<reader> AnyReader(int pageNum) {
        int pagesize= 3;
        System.out.println("1");
        int count= readerMapper.Count();
        System.out.println(count);
        System.out.println("2");
        int PageMax=count/pagesize;
        if (count%pagesize>0){
            PageMax++;
        }
        if(pageNum>PageMax){
            pageNum=PageMax;
        }
        if(pageNum<1){
            pageNum=1;
        }
        int start=(pageNum-1)*pagesize;
        return readerMapper.AnyReader(start,pagesize);


    }
}
