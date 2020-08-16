package com.wellqin.controller;

import com.wellqin.entity.User;
import com.wellqin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Wellqin
 * @Date: 2020/8/17 0:27
 */

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    // 查询

    @GetMapping("/getUser")
    public List<User> getDepartments(){
        return userMapper.getUsers();
    }

    // 查询全部

    @GetMapping("/getUser/{id}")
    public User getDepartment(@PathVariable("id") Integer id){
        return userMapper.getUser(id);
    }
}
