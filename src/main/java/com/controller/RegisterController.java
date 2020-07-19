package com.controller;

import com.entity.gmer;
import com.entity.reader;
import com.entity.worker;
import com.service.GmerService;
import com.service.ReaderService;
import com.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    ReaderService readerService;
    @Autowired
    WorkerService workerService;
    @Autowired
    GmerService gmerService;
    @RequestMapping("/AddReader")
    public  String AddReader(reader reader){

        int  num= readerService.AddReader(reader);
        if (num>0){
            return "新增读者成功";
        }else {
            return "新增读者失败";
        }

    }
    @RequestMapping("/AddWorker")
    public  String AddWorker(worker worker){

        int  num= workerService.AddWorker(worker);
        if (num>0){
            return "新增作者成功";
        }else {
            return "新增作者失败";
        }

    }
    @RequestMapping("/AddGmer")
    public  String AddGmer(gmer gmer){

        int  num= gmerService.AddGmer(gmer);
        if (num>0){
            return "新增管理者成功";
        }else {
            return "新增管理者失败";
        }

    }


}
