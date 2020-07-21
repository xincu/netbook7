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
   /*读者登录*/
    @Override
    public reader ReaderLogin(String raccount, String rpassword) {
        return readerMapper.ReaderLogin(raccount,rpassword);
    }
/*读者注册*/
    @Override
    public int AddReader(reader reader) {
        return readerMapper.AddReader(reader);
    }
/*账号重复判断*/
    @Override
    public reader IsexitsAccount(String raccount) {
        return readerMapper.IsexitsAccount(raccount);
    }
/*称呼重复判断*/
    @Override
    public reader IsexitsName(String rname) {
        return readerMapper.IsexitsName(rname);
    }
/*所有读者查询*/
    @Override
    public List<reader> AllReader() {
        return readerMapper.AllReader();
    }
/*删除读者*/
    @Override
    public int DelReader(int rid) {
        return readerMapper.DelReader(rid);
    }
    /*读者分页*/
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
