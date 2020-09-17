package com.zhw.sc.commons.exceptions;

import com.zhw.sc.commons.enums.IBaseEnum;

import java.text.MessageFormat;

public interface BusinessExceptionAssert extends IBaseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this.getCode(), msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this.getCode(), msg, t);
    }

}
