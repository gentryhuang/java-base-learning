package com.basis.java8.entity;

import lombok.Builder;
import lombok.Data;

/**
 * User
 *
 * @author <a href="mailto:libao.huang@yunhutech.com">shunhua</a>
 * @since 2019/12/19
 * <p>
 * desc：
 */
@Data
@Builder
public class User {
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 性别  1 男 2 女
     */
    private Integer sex;
    /**
     * 薪水
     */
    private double salary;
}
