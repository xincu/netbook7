package com.controller;

import com.entity.book_chapters;
import com.service.BcStateService;
import com.service.BookChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChaptersController {
@Autowired
    BookChaptersService bookChaptersService;
@Autowired
    BcStateService bcStateService;
@RequestMapping("AddChapters")
    public  String AddChapters(book_chapters bookChapters){
     int  num=bookChaptersService.AddChapters(bookChapters);
    if (num>0){
        return "新增章节成功";
    }else {
        return "新增章节失败";
    }

}


}
