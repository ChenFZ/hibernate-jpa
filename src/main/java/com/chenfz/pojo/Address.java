/**
 * Copyright (C), 2015-2018, 浙江广信有限公司
 * FileName: Address
 * Author:   chenfz
 * Date:     2018/12/14 9:53
 * Description: 用户地址表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户地址表〉
 *
 * @author chenfz
 * @create 2018/12/14
 * @since 1.0.0
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private Long useId;

    @Column(length = 255)
    private String address;

    public Address(Long useId, String address) {
        this.useId = useId;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUseId() {
        return useId;
    }

    public void setUseId(Long useId) {
        this.useId = useId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
