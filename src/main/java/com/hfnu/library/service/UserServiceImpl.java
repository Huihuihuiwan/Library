package com.hfnu.library.service;

import com.hfnu.library.dao.UserMapper;
import com.hfnu.library.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author : wendy_wan
 * Created : 2020/3/23 19:08
 */
@Service
public class UserServiceImpl implements UserService {

    //有bean则注入，没有则不注入
    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public User checkUser(User user) {
        return userMapper.checkUser(user);
    }

    @Override
    public User checkManager(User user) {
        return userMapper.checkManager(user);
    }
}
