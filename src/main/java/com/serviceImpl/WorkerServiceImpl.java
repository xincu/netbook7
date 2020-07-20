package com.serviceImpl;

import com.entity.worker;
import com.mapper.WorkerMapper;
import com.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
  @Autowired
  private WorkerMapper workerMapper;

    @Override
    public worker WorkerLogin(String waccount, String wpassword) {
        return workerMapper.WorkerLogin(waccount,wpassword);
    }

  @Override
  public int AddWorker(worker worker) {
    return workerMapper.AddWorker(worker);
  }

  @Override
  public worker IsexistAccount(String waccount) {
    return workerMapper.IsexistAccount(waccount);
  }

  @Override
  public worker IsexistName(String wname) {
    return workerMapper.IsexistName(wname);
  }

  @Override
  public List<worker> AllWorker() {
    return workerMapper.AllWorker();
  }

  @Override
  public int DelWorker(int wid) {
    return workerMapper.DelWorker(wid);
  }

  @Override
  public List<worker> AnyWorker(int pageNum) {
    int  pageSize= 2;
    int count=workerMapper.Count();
    int pageMax=count/pageSize;
    if (count%pageSize>0){
      pageMax++;
    }
    if (pageNum>pageMax){
      pageNum=pageMax;
    }
    if(pageNum<1){
      pageNum=1;
    }
    int start=pageNum*pageSize-pageSize;

      return workerMapper.AnyWorker(start,pageSize);
  }
}
