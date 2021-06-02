package com.zhw.sc.user.client;

import com.zhw.sc.common.contract.bean.Result;
import com.zhw.sc.user.entity.Admin;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hongweizou on 16/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserClientTest {
    @Autowired
    private UserClient userClient;

    @Test
    public void test01() {
        Result<Admin> result = userClient.getAdmin(1L);
        System.out.println(result.getData().getName());
        Assert.assertTrue(result.isSuccess());
    }
}
