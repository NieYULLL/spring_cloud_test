package com.rookie.practice.service;

import com.rookie.practice.entity.SysUserInfo;

/**
 * @Description: <br/>
 * @Copyright(c): 2020, Rookie <br/>
 * @ProgramName: IUserService.java <br/>
 * @Date: 2020/1/6 10:00
 * @Author: Rookie-nie <br/>
 * @Version: 1.0
 */
public interface IUserService {

    SysUserInfo getUserById(Integer id);
}
