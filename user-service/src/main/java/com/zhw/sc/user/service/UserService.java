package com.zhw.sc.user.service;

import com.zhw.sc.user.entity.Admin;
import com.zhw.sc.user.persistence.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ZHW on 2015/5/8.
 */
@Service
public class UserService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin getAdmin(Long id) {
        return adminMapper.selectByPrimaryKey(id);
    }

}
