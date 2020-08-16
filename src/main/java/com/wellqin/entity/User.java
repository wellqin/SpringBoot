package com.wellqin.entity;
/**
 * @Author: Wellqin
 * @Date: 2020/8/17 0:05
 * 实体类
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String departmentName;

}

