package com.acmday.dubbo.demo.consumer.service.impl;

import com.acmday.dubbo.demo.api.facade.IEchoService;
import com.acmday.dubbo.demo.api.facade.IHelloService;
import com.acmday.dubbo.demo.consumer.service.IGreetingService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author acmday.
 * @Date 2022/4/7 5:56 下午
 * @Description
 */
@Service
public class GreetingServiceImpl implements IGreetingService {

    @DubboReference(group = "acmday", version = "1.0")
    private IEchoService echoService;

    @DubboReference(group = "acmday", version = "1.0")
    private IHelloService helloService;

    @Override
    public String greeting(String message) {
        return echoService.echo(message);
    }

    @Override
    public String hello(String message) {
        return helloService.sayHello(message);
    }
}
