package com.hfnu.library.service;

import com.hfnu.library.pojo.User;

/**
 * Author : wendy_wan
 * Created : 2020/3/23 19:07
 */
public interface UserService {
    User checkUser(User user);
    User checkManager(User user);
}
