package com.xiaxinyu.spring.async.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author summer
 * @date 2020.7.31
 */
@Slf4j
@Component
public class AsyncTask {

    @Async("async-executor-main")
    public void handle1() throws InterruptedException {
        Thread.sleep(500);
        log.info("I am main");
    }

    @Async("async-executor-sub1")
    public void handle2() throws InterruptedException {
        Thread.sleep(500);
        log.info("I am sub1");
    }

    @Async("async-executor-sub2")
    public void handle3() throws InterruptedException {
        Thread.sleep(500);
        log.info("I am sub2");
    }
}
