/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserResult
 * Author:   chenfz
 * Date:     2018/12/14 9:59
 * Description: 用户查询结果集
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.pojo.resultSet;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户查询结果集〉
 *
 * @author chenfz
 * @create 2018/12/14
 * @since 1.0.0
 */
public interface UserResult {

    Long getId();

    String getName();

    int getAge();

    String getAddress();
}
