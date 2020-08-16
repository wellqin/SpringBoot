package com.wellqin.mapper;

import com.wellqin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Wellqin
 * @Date: 2020/8/17 0:05
 */

// @Mapper : 表示本类是一个 MyBatis 的 Mapper
// Repository代表被springboot整合了

@Mapper
@Repository
public interface UserMapper {

    // 获取所有

    List<User> getUsers();

    // 通过id获得

    User getUser(Integer id);

}
