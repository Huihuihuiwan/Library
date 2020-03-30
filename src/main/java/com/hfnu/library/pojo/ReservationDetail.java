package com.hfnu.library.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author wendy_wan
 * @date 2020/2/17 10:11
 */
@Data
//视图ReservationDetail
public class ReservationDetail {
    private int reservationId;
    private int bookId;
    private String bname;
    private String userName;
    private Date deadline;
}
