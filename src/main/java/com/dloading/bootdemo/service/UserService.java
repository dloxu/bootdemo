package com.dloading.bootdemo.service;


import com.dloading.bootdemo.mapper.UserMapper;
import com.dloading.bootdemo.model.Goods;
import com.dloading.bootdemo.model.Result;
import com.dloading.bootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dloading
 * @since 2019/12/18
 * 用户相关业务逻辑层
 */
@Service
public class UserService  {

    @Autowired
    private UserMapper userMapper;

    public User findByUserName(String username){
        return userMapper.findByUserName(username);
    }

    public Result createUser(User user){
        User existUser=userMapper.findByUserName(user.getUsername());
        if (existUser==null){
            userMapper.createUser(user);
            return new Result(true,"该用户不存在，注册成功");
        }else {
            return new Result(false,"该用户名已经存在,注册失败");
        }
    }


}
