package com.zhw.sc.base.client.customize;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import feign.Feign;
import feign.Target;
import feign.hystrix.SetterFactory;

import java.lang.reflect.Method;

public class CommandKeyCustomize implements SetterFactory {
    @Override
    public HystrixCommand.Setter create(Target<?> target, Method method) {
        String groupKey = target.name();
        String commandKey = target.type().getName().replace(".", "#");
        return HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey)).andCommandKey(com.netflix.hystrix.HystrixCommandKey.Factory.asKey(commandKey));
    }
}
