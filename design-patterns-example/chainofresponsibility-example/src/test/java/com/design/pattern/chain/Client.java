package com.design.pattern.chain;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class Client {

    @Test
    public void test(){
        // 创建待验证的用户
        User user = new User("shunhua","gentryhuang.xw@gmail.com","123456");
        // 姓名验证器
        NameHandler nameHandler = new NameHandler();
        // 邮箱验证器
        EmailHandler emailHandler = new EmailHandler();
        // 密码验证器
        PasswordHandler passwordHandler = new PasswordHandler();

        /**
         * 注意：构造责任链是客户端决定的
         *
         * 构建责任链 : NameHandler -> EmailHandler -> PasswordHandler
         */
        nameHandler.setNextHandler(emailHandler);
        emailHandler.setNextHandler(passwordHandler);

        /**
         * 处理请求入口
         */
        nameHandler.handle(user);
    }
}