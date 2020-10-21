package com.li.service.impl;

import com.li.dao.UserDao;
import com.li.pojo.User;
import com.li.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 脚踏实地
 * @Date 2020/10/13 21:32
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<User> findAllUser() {
        return dao.findAllUser();
    }
}
