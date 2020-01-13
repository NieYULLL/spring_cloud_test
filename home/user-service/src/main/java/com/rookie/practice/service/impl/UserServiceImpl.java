package com.rookie.practice.service.impl;

import com.rookie.practice.entity.SysUserInfo;
import com.rookie.practice.mapper.IUserDao;
import com.rookie.practice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: <br/>
 * @Copyright(c): 2020, Rookie <br/>
 * @ProgramName: UserServiceImpl.java <br/>
 * @Date: 2020/1/6 10:00
 * @Author: Rookie-nie <br/>
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    private final IUserDao userDao;

    public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public SysUserInfo getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
