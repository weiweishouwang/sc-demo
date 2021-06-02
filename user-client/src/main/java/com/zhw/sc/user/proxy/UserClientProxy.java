package com.zhw.sc.user.proxy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhw.sc.base.client.proxy.BaseClientProxy;
import com.zhw.sc.common.contract.bean.Result;
import com.zhw.sc.user.api.UserAPI;
import com.zhw.sc.user.client.UserClient;
import com.zhw.sc.user.entity.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class UserClientProxy extends BaseClientProxy implements UserAPI {
    private static final Logger logger = LoggerFactory
            .getLogger(UserClientProxy.class);

    @Autowired
    private UserClient userClient;


    @Override
    @HystrixCommand(
            commandKey = "com.zhw.sc.user.proxy.UserClientProxy.getAdmin",
            fallbackMethod = "getAdminFallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000")
            },
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "10"),
                    @HystrixProperty(name = "maxQueueSize", value = "20"),
                    @HystrixProperty(name = "queueSizeRejectionThreshold", value = "20")
            })
    public Result<Admin> getAdmin(Long id) {
        return userClient.getAdmin(id);
    }

    @Override
    public Result<Admin> throwException() {
        return null;
    }

    /*@HystrixCommand(fallbackMethod = "getAdminFallback")
    public Future<Result<Admin>> getAdminAsync(Long id) {
        return new AsyncResult<Result<Admin>>() {
            @Override
            public Result<Admin> invoke() {
                return userClient.getAdmin(id);
            }
        };
    }*/

    public Result<Admin> getAdminFallback(Long id, Throwable t) {
        return backFallback(t);
    }

}
