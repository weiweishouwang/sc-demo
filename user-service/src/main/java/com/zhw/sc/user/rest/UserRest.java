package com.zhw.sc.user.rest;

import com.zhw.sc.common.contract.bean.Result;
import com.zhw.sc.common.contract.bean.ResultEnum;
import com.zhw.sc.user.api.UserAPI;
import com.zhw.sc.user.entity.Admin;
import com.zhw.sc.user.properties.LogProperties;
import com.zhw.sc.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserRest implements UserAPI {
    static final Logger logger = LoggerFactory
            .getLogger(UserRest.class);

    @Autowired
    private UserService userService;

    @Autowired
    private LogProperties properties;

    @Override
    public Result<Admin> getAdmin(@RequestParam("id") Long id) {
        logger.info("start");
        Result<Admin> result = new Result<>();
        result.setRetCode(ResultEnum.SUCCESS.getCode());
        result.setRetMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(userService.getAdmin(id));

        logger.info(properties.getName());

        return result;
    }

    @Override
    public Result<Admin> throwException() throws Exception {
        throw new Exception("出错了");
    }

}
