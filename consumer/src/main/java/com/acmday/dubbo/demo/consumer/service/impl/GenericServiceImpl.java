package com.acmday.dubbo.demo.consumer.service.impl;

import com.acmday.dubbo.demo.consumer.service.IGreetingService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * @author acmday
 * @date 2023/5/15 下午1:09
 */
public class GenericServiceImpl {
    public static void main(String[] args) {
        ReferenceConfig<IGreetingService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("dubbo-demo-api-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        reference.setInterface(IGreetingService.class);
        reference.setScope("remote");
        IGreetingService service = reference.get();
        String message = service.greeting("acmday");
        System.out.println(message);
    }
}
