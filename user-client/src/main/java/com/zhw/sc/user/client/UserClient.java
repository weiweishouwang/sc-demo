package com.zhw.sc.user.client;


import com.zhw.sc.user.api.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service")
public interface UserClient extends UserAPI {

}

