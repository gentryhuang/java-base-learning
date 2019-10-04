package com.design.pattern.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User 待校验的用户
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Data
@AllArgsConstructor
public class User {
    /**
     * 用户名
     */
    private String name;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String password;

}