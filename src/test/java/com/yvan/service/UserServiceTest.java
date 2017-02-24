package com.yvan.service;

import com.yvan.SpringMybatisTest;
import com.yvan.domain.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by yvan on 2017/2/24.
 */
public class UserServiceTest extends SpringMybatisTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    UserService userService;

    @Test
    public void testGetUserById() throws Exception {
        System.out.println("====================="+userService.getUserById(1));
    }

    @Test
    public void testInsertUser() throws Exception {
        User user = new User();
        user.setUserName("aokai");
        user.setPassword("aokai");
        user.setAge(18);
        userService.insertUser(user);
    }
}