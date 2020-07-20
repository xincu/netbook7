package com.serviceImpl;

import com.entity.book;
import com.mapper.BookMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<book> AnyBook(int pageNum) {
        int pagesize=2;
        int count=bookMapper.Count();
         int PageMax=count/pagesize;
         if (count%pagesize>0){
             PageMax++;
         }
         if (pageNum>PageMax){
             pageNum=PageMax;

         }
         if (pageNum<1){
             pageNum=1;
         }
         int start=(pageNum-1)*pagesize;

        return bookMapper.AnyBook(start,pagesize) ;
    }

    @Override
    public int AddBook(book book) {

        return bookMapper.AddBook(book) ;
    }

    @Override
    public book IsexitsBookName(String bookName) {
        return bookMapper.IsexitsBookName(bookName);
    }
}
