package com.mapper;

import com.entity.worker;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerMapper {
    worker WorkerLogin(String waccount, String wpassword);

    int AddWorker(worker worker);
}
