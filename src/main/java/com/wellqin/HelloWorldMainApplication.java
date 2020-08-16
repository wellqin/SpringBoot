package com.wellqin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Wellqin
 * @Date: 2020/5/23 23:40
 * @Since 1.0.0
 * @springBootApplication：标注一个主程序类，表示这个是一个Springboot应用，点击即可运行
 * 这个注解非常重要，SpringApplication.run里面就需要这个才能启动，如果注释掉，则无法启动
 * Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，SpringBoot就应该运行这个类的main方法来启动SpringBoot应用
 */

@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //启动Spring应用，参数一个为HelloWorldMainApplication类，另一个为参数args

        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
