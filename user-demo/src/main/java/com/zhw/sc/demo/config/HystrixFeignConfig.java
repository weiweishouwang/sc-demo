package com.zhw.sc.demo.config;

import com.zhw.sc.base.client.customize.CommandKeyCustomize;
import feign.Feign;
import feign.hystrix.HystrixFeign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HystrixFeignConfig {

    @Bean
    @Scope
    @ConditionalOnProperty(name = "feign.hystrix.enabled")
    public Feign.Builder feignHystrixBuilder() {
        return HystrixFeign.builder().setterFactory(new CommandKeyCustomize());
    }
}
