package com.yvan.service;

import com.yvan.dao.UserMapper;
import com.yvan.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yvan on 2017/2/24.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public int insertUser(User user) {
        return userMapper.insert(user);
    }

}
