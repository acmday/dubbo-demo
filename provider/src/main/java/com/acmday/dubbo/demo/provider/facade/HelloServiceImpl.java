package com.acmday.dubbo.demo.provider.facade;

import com.acmday.dubbo.demo.api.facade.IHelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author acmday
 * @date 2022/9/13 上午6:28
 */
@Slf4j
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String message) {
        log.info("act=sayHello message={}", message);
        return "Hello " + message;
    }
}
