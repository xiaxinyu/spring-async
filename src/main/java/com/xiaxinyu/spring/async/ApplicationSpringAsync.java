package com.xiaxinyu.spring.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Application Entry
 *
 * @author XIAXINYU3
 * @date 2019.8.30
 */
@SpringBootApplication
@EnableAsync
public class ApplicationSpringAsync {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationSpringAsync.class);
        springApplication.run(args);
    }
}