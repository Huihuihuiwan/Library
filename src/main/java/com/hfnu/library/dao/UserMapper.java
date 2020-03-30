package com.hfnu.library.dao;

import com.hfnu.library.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Author : wendy_wan
 * Created : 2020/3/23 19:29
 */
public interface UserMapper {
    //通过username和password验证用户reader
    User checkUser(@Param("user") User user);
    User checkManager(@Param("user") User user);
}
