package com.controller;

import com.entity.worker;
import com.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkerController {
    @Autowired
    WorkerService workerService;
    /*查看所有作者*/
    @RequestMapping("AllWorker")
    public List<worker> AllWorker(){
        List<worker> worker=workerService.AllWorker();
        return  worker;
    }
   /*删除作者*/
    @RequestMapping("DelWorker")
    public  Object DelWorker(int wid){
        int num =workerService.DelWorker(wid);
        if (num>0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    /*查看作者的分页*/
  @RequestMapping("AnyWorker")
    public  List<worker> AnyWorker(int PageNum){
      List<worker> workers=workerService.AnyWorker(PageNum);
      return workers;
  }
/*作者基本信息的修改*/
    @RequestMapping("/updateWorker")
    public  Object updateWorker(worker worker){
        worker worker1  = workerService.IsexistName(worker.getWname());
        if (worker1==null){
        int num=workerService.updateWorker(worker);
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

