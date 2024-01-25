package com.acmday.dubbo.demo.provider;

import com.acmday.dubbo.demo.api.facade.IEchoService;
import com.acmday.dubbo.demo.api.facade.IHelloService;
import com.acmday.dubbo.demo.provider.facade.EchoServiceImpl;
import com.acmday.dubbo.demo.provider.facade.HelloServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author acmday
 * @date 2022/9/13 上午6:33
 */
@Slf4j
public class GenericApplicationLoader {

    private static final String PROVIDER_NAME = "generic-dubbo-provider";

    public static void main(String[] args) {
        // 进行一些Dubbo 配置
        ServiceConfig<IHelloService> helloServiceConfig = serviceConfig(
                PROVIDER_NAME,
                IHelloService.class,
                new HelloServiceImpl());
        helloServiceConfig.getRegistry().setSimplified(true);
//        MetadataReportConfig metadataReportConfig = new MetadataReportConfig();
//        metadataReportConfig.setAddress("nacos://127.0.0.1:2181");
//        serviceConfig.setMetadataReportConfig(metadataReportConfig);

//        ConfigCenterConfig configCenterConfig = new ConfigCenterConfig();
//        configCenterConfig.setAddress("nacos://127.0.0.1:2181");
//        serviceConfig.setConfigCenter(configCenterConfig);
//        helloServiceConfig.setScope("local");
        // 服务暴露
        helloServiceConfig.export();

        ServiceConfig<IEchoService> echoServiceConfig = serviceConfig(
                PROVIDER_NAME,
                IEchoService.class,
                new EchoServiceImpl());
        echoServiceConfig.getRegistry().setSimplified(true);
        echoServiceConfig.export();

        log.info("------- provider success！！！ -------");
        try {
            System.in.read();
        } catch (IOException e) {
            log.error("provider exception!", e);
        }
    }
    public static <T> ServiceConfig<T> serviceConfig(String applicationName, Class<T> tClass, T obj) {
        ServiceConfig<T> serviceConfig = new ServiceConfig<>();
        // 设置服务名称
        final ApplicationConfig applicationConfig = new ApplicationConfig(applicationName);
        serviceConfig.setApplication(applicationConfig);

        // 设置注册中心地址
        RegistryConfig registryConfig = new RegistryConfig("nacos://127.0.0.1:8848");
        registryConfig.setSimplified(true);
        serviceConfig.setRegistry(registryConfig);

        // 设置暴露接口
        serviceConfig.setInterface(tClass);
        serviceConfig.setRef(obj);

        // 设置 版本 和 分组
        serviceConfig.setVersion("1.0");
        serviceConfig.setGroup("acmday");

        return serviceConfig;
    }
}