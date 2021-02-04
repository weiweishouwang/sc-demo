package com.zhw.sc.user.rest;

import com.zhw.sc.user.entity.Admin;
import com.zhw.sc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hongweizou on 16/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRestTest {
    @Autowired
    private UserRest userRest;

    @Autowired
    private UserService userService;

    @Test
    public void test01() {
        Assert.assertTrue(userRest.getAdmin(1L).isSuccess());
    }

    @Test
    public void test02() {
        Assert.assertTrue(userService.getAdmin(1L).getName().equals("zhw"));
    }

}
