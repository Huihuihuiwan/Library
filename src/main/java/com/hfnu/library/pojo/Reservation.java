package com.hfnu.library.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author wendy_wan
 * @date 2020/2/17 10:07
 */
@Data
//对应Reservation表
public class Reservation {
    private int reservationId;
    private int userId;
    private int bookId;
    private Date deadline;
}
