package com.xiaxinyu.spring.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author summer
 * @date 2020.7.31
 */
@Configuration
public class AsyncConfiguration {

    @Bean(name = "async-executor-main")
    public AsyncTaskExecutor asyncTaskExecutor1() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("async-executor-main");
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(99999);
        return executor;
    }

    @Bean(name = "async-executor-sub1")
    public AsyncTaskExecutor asyncTaskExecutor2() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("async-executor-sub1");
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(99999);
        return executor;
    }

    @Bean(name = "async-executor-sub2")
    public AsyncTaskExecutor asyncTaskExecutor3() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("async-executor-sub2");
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(99999);
        return executor;
    }
}
