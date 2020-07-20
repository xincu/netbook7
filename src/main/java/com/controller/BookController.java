package com.controller;

import com.entity.book;
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
    public String AddBook(book Book ){
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
        return  books;
    }

}
