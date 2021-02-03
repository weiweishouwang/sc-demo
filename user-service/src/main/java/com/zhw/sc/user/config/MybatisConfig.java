package com.zhw.sc.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/1/15 0015.
 */
@Component
@MapperScan(basePackages = {"com.zhw.sc.user.persistence"})
public class MybatisConfig {
}
