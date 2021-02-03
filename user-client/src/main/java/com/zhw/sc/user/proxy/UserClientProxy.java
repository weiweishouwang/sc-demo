package com.zhw.sc.user.proxy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.netflix.hystrix.exception.HystrixTimeoutException;
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
    private UserClient demoClient;


    @Override
    @HystrixCommand(fallbackMethod = "getAdminFallback")
    public Result<Admin> getAdmin(Long id) {
        return demoClient.getAdmin(id);
    }

    @Override
    public Result<Admin> throwException() {
        return null;
    }

    @HystrixCommand(fallbackMethod = "getAdminFallback")
    public Future<Result<Admin>> getAdminAsync(Long id) {
        return new AsyncResult<Result<Admin>>() {
            @Override
            public Result<Admin> invoke() {
                return demoClient.getAdmin(id);
            }
        };
    }

    public Result<Admin> getAdminFallback(Long id, Throwable t) {
        return backFallback(t);
    }

}