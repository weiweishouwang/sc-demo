package com.zhw.sc.commons.exceptions;

import com.zhw.sc.commons.enums.IBaseEnum;

public class BusinessException extends  BaseException {

    private static final long serialVersionUID = 1L;

    public BusinessException(int code, String message) {
        super(code, message);
    }

    public BusinessException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BusinessException(IBaseEnum responseEnum) {
        super(responseEnum);
    }

    public BusinessException(IBaseEnum responseEnum, Throwable cause) {
        super(responseEnum, cause);
    }
}
