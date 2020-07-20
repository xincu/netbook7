package com.serviceImpl;

import com.entity.book;
import com.entity.bookChapters;
import com.mapper.BookMapper;
import com.mapper.bookChaptersMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
   @Autowired
   private bookChaptersMapper bookChaptersMapper;
    @Override
    public List<book> AnyBook(int pageNum) {
        int pagesize=2;
        int count=bookMapper.Count();
        System.out.println(count);
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
        System.out.println(start);
        System.out.println(pagesize);
        List<book> books = bookMapper.AnyBook(start,pagesize) ;
        System.out.println(books);
        return books ;
    }

    @Override
    public int AddBook(book book) {

        return bookMapper.AddBook(book) ;
    }

    @Override
    public book IsexitsBookName(String bookName) {
        return bookMapper.IsexitsBookName(bookName);
    }

    @Override
    public int AddChaptersByWorker(bookChapters bookChapters) {

        return bookChaptersMapper.AddChaptersByWorker(bookChapters) ;
    }

    @Override
    public List<bookChapters> showVia() {
        return bookChaptersMapper.showVia();
    }

    @Override
    public List<bookChapters> showSubmit() {
        return bookChaptersMapper.showSubmit();
    }

    @Override
    public List<bookChapters> showWorker(int bWid) {
        return bookChaptersMapper.showWorker(bWid);
    }
}
