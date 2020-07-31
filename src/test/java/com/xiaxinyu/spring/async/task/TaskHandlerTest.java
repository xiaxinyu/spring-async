package com.xiaxinyu.spring.async.task;


import com.xiaxinyu.spring.async.ApplicationSpringAsync;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationSpringAsync.class})
public class TaskHandlerTest {

    @Autowired
    AsyncTask taskHandler;

    @Test
    public void test1() throws InterruptedException {
        taskHandler.handle1();

        taskHandler.handle2();

        taskHandler.handle3();

        Thread.sleep(10000);
    }
}
