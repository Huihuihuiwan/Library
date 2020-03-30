package com.hfnu.library.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author wendy_wan
 * @date 2020/2/17 9:52
 */

@Data
public class Borrow {
    private int borrowId;
    private int bookId;
    private int userId;
    private Date btime;
    private Date deadline;
    private Date rtime;
    private int operator;

}
