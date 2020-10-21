package com.li.controller;

import com.li.pojo.User;
import com.li.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author 脚踏实地
 * @Date 2020/10/13 21:40
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> allUser = userService.findAllUser();

        model.addAttribute("list",allUser);

        System.out.println(allUser.size()+"****************");
        return "list";
    }
}
