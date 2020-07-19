package com.serviceImpl;

import com.entity.worker;
import com.mapper.WorkerMapper;
import com.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
