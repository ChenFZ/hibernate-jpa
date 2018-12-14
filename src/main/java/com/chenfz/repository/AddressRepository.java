/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AddressRepository
 * Author:   chenfz
 * Date:     2018/12/14 10:07
 * Description: 操作地址
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.repository;

import com.chenfz.pojo.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈操作地址表接口〉
 *
 * @author chenfz
 * @create 2018/12/14
 * @since 1.0.0
 */
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
