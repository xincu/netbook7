package com.controller;

import com.entity.book;
import com.entity.bookChapters;
import com.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    /*新增小说*/
    @RequestMapping("/AddBook")
    public String AddBook(book Book){
   /*     System.out.println(Book.getBookName());
        System.out.println(Book.getBookAuthorWid());
        System.out.println(Book.getBookDescribed());
        System.out.println(Book.getBookKind());*/
        book book=bookService.IsexitsBookName(Book.getBookName());
       if (book==null){
        int num=  bookService.AddBook(Book);
        if (num>0){
            return "ok";
        }else{
            return "no";
        }
    }else{
           return "该书名已存在";
       }
    }
   /*小说分页*/
    @RequestMapping("/AnyBook")
    public List<book> AnyBook(int PageNum){
        List<book> books=bookService.AnyBook(PageNum);
        System.out.println(books);
        return  books;
    }
    /* 增加章节*/
    @RequestMapping("/AddChaptersByWorker")
    public  String AddChapters(bookChapters bookChapters){
       int  num=bookService.AddChaptersByWorker(bookChapters);
      if (num>0){

          if(bookChapters.getBcStateId()==4){
              return "已保存";
          }else{
              return "已提交";
          }

      }else{
          return "提交失败";
      }



    }
   /*小说章节分页*/
    @RequestMapping("/Anychapters")
    public List<bookChapters> Anychapters(int bId,int PageNum){
        List<bookChapters> bookChaptersList=bookService.Anychapters(bId,PageNum);
        return  bookChaptersList;
    }

    /*展现通过的小说章节（指定书本的）给读者看*/
    @RequestMapping("/showVia")
    public  List<bookChapters> showVia(int bId){
        List<bookChapters>  bookChapters=bookService.showVia(bId);

        return bookChapters;
    }
    /*展现已提交的的小说章节给管理员看*/
    @RequestMapping("/showSubmit")
    public  List<bookChapters> showSubmit(){
        List<bookChapters>  bookChapters=bookService.showSubmit();

        return bookChapters;
    }
    /*展现所属是本人的章节给作者看*/
    @RequestMapping("/showWorker")
    public  List<bookChapters> showWorker(int bWid){
        List<bookChapters>  bookChapters=bookService.showWorker(bWid);

        return bookChapters;
    }
    /*根据作者查小说*/
    @RequestMapping("/getBookByworker")
    public List<book> getBookByworker(int wid){
        List<book> bookList=bookService.getBookByworker(wid);
        return bookList;
    }
    /*管理者审核小说章节*/
    @RequestMapping("/AuditChapters")
    public  Object AuditChapters(int bcId,int bcStateId){
           int num= bookService.AuditChapters(bcId,bcStateId);
        if (num>0){
            return "ok";
        }else{
            return "no";
        }

    }
}
