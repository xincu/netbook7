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

    @RequestMapping("/AnyBook")
    public List<book> AnyBook(int PageNum){
        List<book> books=bookService.AnyBook(PageNum);
        System.out.println(books);
        return  books;
    }

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

    @RequestMapping("/showVia")
    public  List<bookChapters> showVia(){
        List<bookChapters>  bookChapters=bookService.showVia();

        return bookChapters;
    }
    @RequestMapping("/showSubmit")
    public  List<bookChapters> showSubmit(){
        List<bookChapters>  bookChapters=bookService.showSubmit();

        return bookChapters;
    }
    @RequestMapping("/showWorker")
    public  List<bookChapters> showWorker(int bWid){
        List<bookChapters>  bookChapters=bookService.showWorker(bWid);

        return bookChapters;
    }
}
