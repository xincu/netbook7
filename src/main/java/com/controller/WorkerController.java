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
    @RequestMapping("AllWorker")
    public List<worker> AllWorker(){
        List<worker> worker=workerService.AllWorker();
        return  worker;
    }

}

