package com.hfnu.library.exception;

import com.hfnu.library.enumeration.ExceptionEnum;
import lombok.Data;

/**
 * @author wendy_wan
 * @date 2020/2/18 22:15
 */
@Data
public class ServiceException extends RuntimeException {
    private Integer code;

    public ServiceException(ExceptionEnum exceptionEnum){
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
    }
}
