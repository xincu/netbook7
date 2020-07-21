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
    /*查看所有读者 （仅管理员可用）*/
    @RequestMapping("/AllReader")
    public List<reader> AllReader(){
        List<reader> reader=readerService.AllReader();
        return reader;
    }
    /*按指定id删除读者（仅管理员看读者可用）*/
    @RequestMapping("DelReader")
    public  Object DelReader(int rid){
        int  num= readerService.DelReader(rid);
        if (num>0){return "删除成功";}
        else{  return "删除失败";}
    }
    /*读者的分页（供管理查看读者时使用）*/
    @RequestMapping("AnyReader")
      public  List<reader> AnyReader(int PageNum){
        List<reader> readers=readerService.AnyReader(PageNum);

        return readers;
    }
    @RequestMapping("/updateReader")
    public  Object updateWorker(reader reader){
        reader reader1  =readerService.IsexitsName(reader.getRname());
        if (reader1==null){
            int num=readerService.updateReader(reader);
            if (num>0){
                return "修改成功";
            }else{
                return "修改失败";
            }
        }else {
            return"该称呼已存在";
        }
    }

}
