/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: UserService
 * Author:   chenfz
 * Date:     2018/12/14 14:25
 * Description: 用户服务层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户服务层〉
 *
 * @author chenfz
 * @create 2018/12/14
 * @since 1.0.0
 */
@Service
public class RedisService {

    @Resource
    private RedisTemplate<String ,Object> redisTemplate;

    public void set(String key ,Object value){
        RedisSerializer serializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(serializer);
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        vo.set(key,value);
    }

    public Object get(String key){
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

}
