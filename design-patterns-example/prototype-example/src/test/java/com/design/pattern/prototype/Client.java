package com.design.pattern.prototype;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-16
 */
public class Client {

    @Test
    public void test() throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("邮件模版");

        for(int i = 0; i < 10; i++){
            /** 需要创建多个Mail对象,注意不会调用Mail的构造方法，而是调用了Mail中的clone方法 **/
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setAddress("姓名" + i + "@" + "gmail.com");
            mailTemp.setContent("你收到一封邮件");
            MailUtil.sendMail(mailTemp);
        }
        // 得到原始的邮件模版
        MailUtil.mailTemplate(mail);
    }

}