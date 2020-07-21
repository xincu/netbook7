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
    /*注册3个*/
    @RequestMapping("/AddReader")
    public  String AddReader(reader reader){
      reader reader1=readerService.IsexitsAccount(reader.getRaccount());
      reader reader2= readerService.IsexitsName(reader.getRname());
        int  num= readerService.AddReader(reader);
        if (num>0){
            return "新增读者成功";
        }else {
            return "新增读者失败";
        }

    }
    @RequestMapping("/AddWorker")
    public  String AddWorker(worker worker){
     worker worker1=workerService.IsexistAccount(worker.getWaccount());
     worker worker2=workerService.IsexistName(worker.getWname());
        if (worker1==null){
            if (worker2==null) {
                int num = workerService.AddWorker(worker);
                if (num > 0) {
                    return "新增作者成功";
                } else {
                    return "新增作者失败";
                }
            }else{
                    return "用户名已存在";
                }


            }else{
                return  "该账号已存在";
            }
    }
    @RequestMapping("/AddGmer")
    public  String AddGmer(gmer gmer){
      gmer gmer1=gmerService.IsexistAccount(gmer.getGaccount());
      gmer gmer2=gmerService.IsexistName(gmer.getGname());
      if (gmer1==null){
          if (gmer2==null){
              int  num= gmerService.AddGmer(gmer);
              if (num>0){
                  return "新增管理者成功";
              }else {
                  return "新增管理者失败";
              }

          }else{
              return "用户名已存在";
          }


    }else{
          return  "该账号已存在";
      }
    }


}
