/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserRepository
 * Author:   chenfz
 * Date:     2018/12/13 15:16
 * Description: 操作用户表接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.repository;

import com.chenfz.pojo.User;
import com.chenfz.pojo.resultSet.UserResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈操作用户表接口〉
 *
 * @author chenfz
 * @create 2018/12/13
 * @since 1.0.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /*在SQL的查询方法上面使用@Query注解，如涉及到删除和修改在需要加上@Modifying.
    也可以根据需要添加 @Transactional 对事物的支持，查询超时的设置等*/
    User findByName(String name);

    Page<User> findByNameLike(String name,Pageable pageable);
    List<User> findByNameLike(String name);

    @Modifying
    Long removeByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where name = :name")
    User findUser(@Param("name") String name);

    User findByAgeLessThan(int age);

    Page<User> findAll(Pageable pageable);

    User findFirstByOrderByAgeDesc();

//    @Query("select u.id,u.name,u.age,a.address from User u left join address a on u.id=a.user_id where u.id = :id")
//    UserResult findUserResultById(Long id);
}
