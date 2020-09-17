package com.zhw.sc.commons.exceptions;

import com.zhw.sc.commons.enums.IBaseEnum;

public abstract class BaseException extends RuntimeException {

    private int code;

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BaseException(IBaseEnum responseEnum) {
        super(responseEnum.getMessage());
        this.code = responseEnum.getCode();
    }

    public BaseException(IBaseEnum responseEnum, Throwable cause) {
        super(responseEnum.getMessage(), cause);
        this.code = responseEnum.getCode();
    }

    public int getCode() {
        return code;
    }
}
