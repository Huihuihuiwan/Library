package com.hfnu.library.pojo;

import lombok.Data;

/**
 * @author wendy_wan
 * @date 2020/2/18 20:55
 */

@Data
//视图reservation_detail
public class ReservationResult<T> {
    boolean success;
    T data;
    String error;
}
