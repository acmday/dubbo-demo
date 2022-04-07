package com.acmday.dubbo.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author acmday.
 * @Date 2022/4/7 5:14 下午
 * @Description
 */
@Slf4j
@SpringBootApplication
public class ApplicationLoader {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLoader.class, args);
        log.info("------- consumer success！！！ -------");
    }
}