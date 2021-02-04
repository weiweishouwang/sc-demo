package com.zhw.sc.user.proxy;

import com.zhw.sc.common.contract.bean.Result;
import com.zhw.sc.user.entity.Admin;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by hongweizou on 16/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserClientProxyTest {
    @Autowired
    private UserClientProxy userClientProxy;

    @Test
    public void test01() {
        Assert.assertTrue(userClientProxy.getAdmin(1L).isSuccess());
    }

    /*@Test
    public void test02() throws ExecutionException, InterruptedException {
        Future<Result<Admin>> future = userClientProxy.getAdminAsync(1L);
        Assert.assertTrue(future.get().isSuccess());
    }*/
}
