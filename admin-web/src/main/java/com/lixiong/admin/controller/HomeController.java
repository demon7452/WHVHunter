package com.lixiong.admin.controller;

import com.entity.User;
import com.lixiong.admin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by lixiong on 2017/10/13.
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String homePage(){
        return "hello world";
    }

    @RequestMapping(value = "/query/{userId}")
    public User findUserByUserId(@PathVariable int userId){
        return userMapper.findByUserId(userId);
    }
}
