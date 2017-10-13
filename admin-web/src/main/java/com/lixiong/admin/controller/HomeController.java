package com.lixiong.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description:
 * Created by lixiong on 2017/10/13.
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String homePage(){
        return "hello world";
    }
}
