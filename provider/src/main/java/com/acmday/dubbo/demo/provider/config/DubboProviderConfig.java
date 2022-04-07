package com.acmday.dubbo.demo.provider.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author acmday.
 * @Date 2022/4/7 7:25 下午
 * @Description
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.acmday.dubbo.demo.provider")
public class DubboProviderConfig {

    @Bean
    public DubboProviderConfig providerConf(){
        return new DubboProviderConfig();
    }

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-echo-provider");
        applicationConfig.setQosAcceptForeignIp(false);
        applicationConfig.setQosEnable(true);
        applicationConfig.setQosPort(33333);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("nacos");
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setPort(8840);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
