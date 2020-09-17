package com.zhw.sc.commons.enums;

import com.zhw.sc.commons.exceptions.BusinessExceptionAssert;

public enum CommonEnum implements BusinessExceptionAssert {

    SYSTEM_ERROR(-100001, "系统出错!")
    ,
    VALID_ERROR(-100002, "参数验证错误!")
    ,
    SUCCESS(0, "成功！")
    ;


    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;


    CommonEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    CommonEnum() {
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
