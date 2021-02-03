package com.zhw.sc.user.api;

import com.zhw.sc.common.contract.bean.Result;
import com.zhw.sc.user.entity.Admin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserAPI {

    @RequestMapping(value = "/getAdmin", method = RequestMethod.GET)
    public Result<Admin> getAdmin(@RequestParam("id") Long id);

    @RequestMapping(value = "/throwException", method = RequestMethod.GET)
    public Result<Admin> throwException() throws Exception;

}
