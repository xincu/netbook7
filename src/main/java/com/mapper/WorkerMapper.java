package com.mapper;

import com.entity.worker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerMapper {
    worker WorkerLogin(String waccount, String wpassword);

    int AddWorker(worker worker);

    worker IsexistName(String wname);

    worker IsexistAccount(String waccount);

    List<worker>  AllWorker();

    int DelWorker(String wid);

    int DelWorker(int wid);

    int Count();

    List<worker> AnyWorker(int start, int pageSize);

    int updateWorker(worker worker);

    List<worker> likeWorker(String wname);
}
