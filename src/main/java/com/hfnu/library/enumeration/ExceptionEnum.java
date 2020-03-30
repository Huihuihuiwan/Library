package com.hfnu.library.enumeration;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wendy_wan
 * @date 2020/2/18 22:07
 */
@Getter
public enum  ExceptionEnum {
    //ADD_FAILURE(10001,"添加失败");
    RESERVATION_FAILURE(10002,"预约失败");

    private Integer code;
    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
