package com.acmday.dubbo.demo.consumer.controller;

import com.acmday.dubbo.demo.consumer.service.IGreetingService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acmday.
 * @Date 2022/4/7 9:09 下午
 * @Description
 */
@RestController
@Slf4j
public class GreetingController {

    @Resource
    private IGreetingService greetingService;

    @GetMapping("/echo")
    public String greeting(String message) {
        log.info("act=greeting message={}", message);
        return greetingService.greeting((message));
    }

    @GetMapping("/hello")
    public String hello(String message) {
        log.info("act=hello message={}", message);
        return greetingService.hello("acmday");
    }
}
