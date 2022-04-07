package com.acmday.dubbo.demo.provider.facade;

import com.acmday.dubbo.demo.api.facade.IEchoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author acmday.
 * @Date 2022/4/7 7:28 下午
 * @Description
 */
@DubboService(version = "1.0", group = "acmday")
public class EchoServiceImpl implements IEchoService {

    @Override
    public String echo(String message) {
        return "hello:" + message;
    }
}
