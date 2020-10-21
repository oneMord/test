package com.li.dao;

import com.li.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 脚踏实地
 * @Date 2020/10/13 21:19
 * @Version 1.0
 */
@Repository
public interface UserDao {
    List<User> findAllUser();
}
