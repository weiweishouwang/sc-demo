package com.zhw.sc.user.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/12/29 0029.
 */
@Component
@ConfigurationProperties(prefix = "log")
public class LogProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
