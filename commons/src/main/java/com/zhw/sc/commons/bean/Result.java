package com.zhw.sc.commons.bean;

import com.zhw.sc.commons.enums.CommonEnum;
import com.zhw.sc.commons.enums.IBaseEnum;

public class Result<T> {
    private boolean success = true;

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

    private T data;

    public Result(IBaseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
        setSuccess();
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
        setSuccess();
    }

    public Result() {
        this.code = CommonEnum.SUCCESS.getCode();
        this.message = CommonEnum.SUCCESS.getMessage();
        setSuccess();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        setSuccess();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    private void setSuccess() {
        this.success = this.code >= 0;
    }
}
