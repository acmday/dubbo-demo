package com.acmday.dubbo.demo.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author acmday.
 * @Date 2022/4/7 7:25 下午
 * @Description
 */
@Slf4j
@SpringBootApplication
//@EnableAspectJAutoProxy
public class ApplicationLoader {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLoader.class, args);
        log.info("------- provider success！！！ -------");
    }
}
