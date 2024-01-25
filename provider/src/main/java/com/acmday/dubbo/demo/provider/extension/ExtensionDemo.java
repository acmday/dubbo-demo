package com.acmday.dubbo.demo.provider.extension;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author acmday
 * @date 2023/4/23 下午6:45
 */
public class ExtensionDemo {

    public void f() {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();

        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();

    }
}
