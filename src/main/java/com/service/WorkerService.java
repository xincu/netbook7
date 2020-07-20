package com.service;

import com.entity.worker;

import java.util.List;

public interface WorkerService {
    worker WorkerLogin(String waccount, String wpassword);

    int AddWorker(worker worker);

    worker IsexistAccount(String waccount);

    worker IsexistName(String wname);

    List<worker> AllWorker();
}
