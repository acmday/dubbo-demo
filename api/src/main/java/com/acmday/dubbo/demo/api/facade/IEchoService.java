package com.acmday.dubbo.demo.api.facade;

/**
 * @Author acmday.
 * @Date 2022/4/7 5:00 下午
 * @Description
 */
public interface IEchoService {

    /**
     * 验证dubbo自动加载、服务暴露流程
     *
     * @param message
     * @return
     */
    String echo(String message);
}
