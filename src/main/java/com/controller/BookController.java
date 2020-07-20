package com.controller;

import com.entity.book;
import com.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping("/AddBook")
    public String AddBook(book Book ){
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


}
