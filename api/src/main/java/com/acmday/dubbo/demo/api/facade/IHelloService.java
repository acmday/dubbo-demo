package com.acmday.dubbo.demo.api.facade;

/**
 * @author acmday
 * @date 2022/9/13 上午6:28
 */
public interface IHelloService {
    /**
     * 验证范化调用
     *
     * @param message
     * @return
     */
    String sayHello(String message);
}
