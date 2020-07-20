package com.controller;

import com.entity.reader;
import com.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReaderController {

    @Autowired
    ReaderService readerService;
    @RequestMapping("/AllReader")
    public List<reader> AllReader(){
        List<reader> reader=readerService.AllReader();
        return reader;
    }
    @RequestMapping("DelReader")
    public  Object DelReader(int rid){
        int  num= readerService.DelReader(rid);
        if (num>0){return "删除成功";}
        else{  return "删除失败";}
    }
}
