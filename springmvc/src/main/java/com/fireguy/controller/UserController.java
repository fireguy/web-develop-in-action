package com.fireguy.controller;


import com.fireguy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public ModelAndView getAllStudent() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("usersDisplay");
        mav.addObject("users", userService.getAllUsers());
        return mav;
    }
}


