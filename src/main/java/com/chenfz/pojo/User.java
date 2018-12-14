/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: User
 * Author:   chenfz
 * Date:     2018/12/13 15:12
 * Description: 用户表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户表〉
 *
 * @author chenfz
 * @create 2018/12/13
 * @since 1.0.0
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    // 省略构造函数

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
// 省略getter和setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
