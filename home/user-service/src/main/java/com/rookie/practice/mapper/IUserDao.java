package com.rookie.practice.mapper;

import com.rookie.practice.entity.SysUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Description: <br/>
 * @Copyright(c): 2020, Rookie <br/>
 * @ProgramName: IUserDao.java <br/>
 * @Date: 2020/1/6 10:01
 * @Author: Rookie-nie <br/>
 * @Version: 1.0
 */
@Mapper
@Component("userDao")
public interface IUserDao {

    SysUserInfo getUserById(@Param("id") Integer id);

    int updateUserById(@Param("user") SysUserInfo userInfo);

}
