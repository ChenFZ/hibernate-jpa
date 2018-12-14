package com.chenfz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 功能描述: <br>
 *    (1) @ComponentScan(basePackages = "xxx.xxx.xxx")：扫描 @Controller、@Service 注解；
 *     (2) @EnableJpaRepositories(basePackages = "xxx.xxx.xxx")：扫描 @Repository 注解；
 *     (3) @EntityScan(basePackages = "xxx.xxx.xxx")：扫描 @Entity 注解；
 * @return:
 * @since: 1.0.0
 * @Author:chenfz
 * @Date: 2018/12/13 15:49
 */

@SpringBootApplication
public class SpringBootHibernateJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHibernateJpaApplication.class, args);
    }

}

