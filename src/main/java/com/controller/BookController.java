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
        int num=  bookService.AddBook(Book);
        if (num>0){
            return "ok";
        }else{
            return "no";
        }
    }

}
