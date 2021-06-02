package com.zhw.sc.demo.rest;

import com.zhw.sc.common.contract.bean.Result;
import com.zhw.sc.common.contract.bean.ResultEnum;
import com.zhw.sc.user.api.UserAPI;
import com.zhw.sc.user.client.UserClient;
import com.zhw.sc.user.entity.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoRest {
    static final Logger logger = LoggerFactory
            .getLogger(DemoRest.class);

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/demo/getAdmin", method = RequestMethod.GET)
    public Result<Admin> getAdmin(@RequestParam("id") Long id) {
        return userClient.getAdmin(id);
    }

}
