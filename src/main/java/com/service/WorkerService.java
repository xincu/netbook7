package com.service;

import com.entity.worker;

public interface WorkerService {
    worker WorkerLogin(String waccount, String wpassword);

    int AddWorker(worker worker);
}
