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
public class LoginController {
    @Autowired
    ReaderService readerService;
    @Autowired
    WorkerService workerService;
    @Autowired
    GmerService gmerService;
    /*登录3个*/
    @RequestMapping("/ReaderLogin")
    public  String ReaderLogin(String raccount,String rpassword){
        System.out.println("读者 "+raccount+",密码"+rpassword);
        reader reader=readerService.ReaderLogin(raccount,rpassword);
        if (reader!=null){
            return "ok";
        }else{
            return "no";
        }
    }
    @RequestMapping("/WorkerLogin")
    public  String WorkerLogin(String waccount,String wpassword){
        System.out.println("作者"+waccount+",密码"+wpassword);
        worker worker=workerService.WorkerLogin(waccount,wpassword);
        if (worker!=null){
            return "ok";
        }else{
            return "no";
        }
    }
    @RequestMapping("/GmerLogin")
    public  String GmerLogin(String gaccount,String gpassword){
        System.out.println("管理员"+gaccount+",密码"+gpassword);
        gmer gmer=gmerService.GmerLogin(gaccount,gpassword);
        if (gmer!=null){
            return "ok";
        }else{
            return "no";
        }
    }

}
