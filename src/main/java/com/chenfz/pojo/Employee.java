/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: Employee
 * Author:   chenfz
 * Date:     2018/12/13 14:22
 * Description: 雇员实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈雇员实体类〉
 *
 * @author chenfz
 * @create 2018/12/13
 * @since 1.0.0
 */
@Entity
@Table(name = "worker")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // 主键生成策略，默认auto
    private Long id;
    @Column(name="emp_name" ,length = 30)
    private String name;
    @Column(name = "emp_age",nullable = false)
    private int age;
    @Column(name = "emp_address",nullable = false,unique = true)
    private String addree;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddree() {
        return addree;
    }

    public void setAddree(String addree) {
        this.addree = addree;
    }
}
