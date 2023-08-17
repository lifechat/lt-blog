package com.lefei.exception;

import lombok.Getter;

import static com.lefei.enums.StatusCodeEnum.FAIL;

/**
 * 业务异常
 *
 **/
@Getter
public class ServiceException extends RuntimeException{
    /**
     * 返回失败状态码
     */
    private Integer code = FAIL.getCode();
    /**
     * 返回信息
     */
    private final String message;

    public ServiceException(String message) {
        this.message = message;
    }
}
