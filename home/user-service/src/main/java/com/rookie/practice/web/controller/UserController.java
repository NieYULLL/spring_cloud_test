package com.rookie.practice.web.controller;

import com.rookie.practice.entity.SysUserInfo;
import com.rookie.practice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: <br/>
 * @Copyright(c): 2020, Rookie <br/>
 * @ProgramName: UserController.java <br/>
 * @Date: 2020/1/6 09:59
 * @Author: Rookie-nie <br/>
 * @Version: 1.0
 */
@RestController
@RequestMapping("/web")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    SysUserInfo getUserById( @PathVariable Integer id) {
        return userService.getUserById(id);
    }


}
