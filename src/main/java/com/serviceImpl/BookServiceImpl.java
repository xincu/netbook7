package com.serviceImpl;

import com.entity.book;
import com.entity.bookChapters;
import com.mapper.BookMapper;
import com.mapper.bookChaptersMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
   @Autowired
   private bookChaptersMapper bookChaptersMapper;
   /*小说展示分页*/
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
/*新增小说*/
    @Override
    public int AddBook(book book) {

        return bookMapper.AddBook(book) ;
    }
   /*书名重复判断*/
    @Override
    public book IsexitsBookName(String bookName) {
        return bookMapper.IsexitsBookName(bookName);
    }
   /*新增小说章节*/
    @Override
    public int AddChaptersByWorker(bookChapters bookChapters) {
        return bookChaptersMapper.AddChaptersByWorker(bookChapters) ;
    }
    /*指定书id 章节的向读者展示*/
    @Override
    public List<bookChapters> showVia(int bId) {
        return bookChaptersMapper.showVia(bId);
    }
   /*展示所有已提交的章节给管理员*/
    @Override
    public List<bookChapters> showSubmit() {
        return bookChaptersMapper.showSubmit();
    }
   /*展示本人的所有章节给作者*/
    @Override
    public List<bookChapters> showWorker(int bWid) {
        return bookChaptersMapper.showWorker(bWid);
    }
/*指定小说的章节分页*/
    @Override
    public List<bookChapters> Anychapters(int bId, int pageNum) {
        int pageSize=3;
        int  Count=bookChaptersMapper.Count(bId);
        int PageMAX=Count/pageSize;
        if (Count%pageSize>0){
            PageMAX++;
        }
        if (PageMAX<pageNum){
            pageNum=PageMAX;
        }
        if(pageNum<1){
            pageNum=1;
        }
        int start=pageNum*pageSize-pageSize;


        return bookChaptersMapper.Anychapters(start,pageSize,bId);
    }
/*根据作者获得小说*/
    @Override
    public List<book> getBookByworker(int wid) {
        return bookMapper.getBookByworker(wid);
    }
/*管理审核章节*/
    @Override
    public int AuditChapters(int bcId, int bcStateId) {
        return bookChaptersMapper.AuditChapters(bcId,bcStateId);
    }
/*更新章节*/
    @Override
    public int updateChapters(bookChapters bookChapters) {
        return bookChaptersMapper.updateChapters(bookChapters);
    }
/*通过指定书的指定章节获取小说存储的路径*/
    @Override
    public String showChapter(int bcId) {
        return bookChaptersMapper.showChapter(bcId);
    }
    /*事务，关于删除指定id的书同时删除所有该书的章节*/
    @Override
    @Transactional
    public int delBook(int bId) {
        System.out.println("删除开始");
        System.out.println("删除bc表中的小说章节");
         this.delBookINBookChapters(bId);
        System.out.println("删除成功");
        System.out.println("删除b表的指定小说");
         this.delBookInBook(bId);
        System.out.println("删除成功");
        return 0;
    }
    /*先删章节*/
    @Transactional
    public  void delBookINBookChapters(int bId){
        int num1=bookChaptersMapper.delBookINBookChapters(bId);

    }
    /*再删书名*/
    @Transactional
    public void delBookInBook(int bId){
        int num2=bookMapper.delBookInBook(bId);

    }
}
