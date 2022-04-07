package com.acmday.dubbo.demo.consumer.config;

import com.acmday.dubbo.demo.consumer.ApplicationLoader;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author acmday.
 * @Date 2022/4/7 5:16 下午
 * @Description
 */
@Configuration
@EnableDubbo(scanBasePackageClasses = ApplicationLoader.class)
@ComponentScan(basePackageClasses = ApplicationLoader.class)
public class DubboConsumerConfig {

    @Bean
    public DubboConsumerConfig consumerConf() {
        return new DubboConsumerConfig();
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-echo-consumer");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("nacos");
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setPort(8840);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
