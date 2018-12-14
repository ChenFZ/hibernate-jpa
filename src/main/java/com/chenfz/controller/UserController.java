/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: UserController
 * Author:   chenfz
 * Date:     2018/12/14 14:32
 * Description: 用户类控制层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.controller;

import com.chenfz.pojo.User;
import com.chenfz.repository.UserRepository;
import com.chenfz.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户类控制层〉
 *
 * @author chenfz
 * @create 2018/12/14
 * @since 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private RedisService redisService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/saveUser")
    public String save(String name,int age){

        User user = userRepository.save(new User(name, age));
        redisService.set(user.getId()+"",user);
        System.out.println("redis缓存了"+user.getId());
        return user.toString();
    }

    @GetMapping("/{id}")
    @Cacheable(value = "user-key")
    public String show(@PathVariable("id")Long id){
        User u = (User)redisService.get(id + "");
        System.out.println("（没有自动调用）无redis缓存调用");
        if (u == null){
            System.out.println("无redis缓存调用。。。。");
            Optional<User> user = userRepository.findById(id);
            return user.get().toString();
        }
        System.out.println("获取redis缓存");
        return u.toString();
    }

    @GetMapping("/")
    public String index(){
        List<User> all = userRepository.findAll();
        redisService.set("all",all);
        return all.toString();
    }
}
