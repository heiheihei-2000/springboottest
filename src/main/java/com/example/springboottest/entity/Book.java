package com.example.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//类和数据库表的绑定
@Data //用于生成各种get，set方法
public class Book {
    @Id
    private Integer id;
    private String name;
    private String auther;

}
