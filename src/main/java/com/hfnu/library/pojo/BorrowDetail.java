package com.hfnu.library.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author wendy_wan
 * @date 2020/2/17 9:57
 */

@Data
//对应视图BorrowDetail
public class BorrowDetail {
    //`borrow`.`borrow_id`
    private int borrowId;
    //`booklist`.`bname`
    private String bname;
    //reader`.`user_name`
    private String userName;
    //`borrow`.`deadline`
    private Date deadline;
    //`borrow`.`btime`
    private Date btime;
    //`borrow`.`rtime`
    private Date rtime;
}
