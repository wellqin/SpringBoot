package com.wellqin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wellqin
 * @Date: 2020/5/30 23:14
 * RestController：是spring4里的新注解，是@ResponseBody和@Controller的缩写。
 */

// 注解@Controller

@RestController
public class HelloController {

    // 接受浏览器hello请求

    @RequestMapping("/hello")
    public String hello(){
        return "YES hello SpringBoot,this is my first Application";
    }
}
