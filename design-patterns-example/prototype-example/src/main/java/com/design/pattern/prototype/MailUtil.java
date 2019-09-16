package com.design.pattern.prototype;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;

/**
 * MailUtil
 *
 * @author shunhua
 * @date 2019-09-16
 */
@Slf4j
public class MailUtil {
    /**
     * 发送邮件
     * @param mail
     */
   public static void sendMail(Mail mail){
       String content = "向{0},邮件地址:{1},邮件内容：{2}发送邮件";
       log.info(MessageFormat.format(content,mail.getName(),mail.getAddress(),mail.getContent()));
   }

    /**
     * 保存邮件的模版内容
     * @param mail
     */
   public static void mailTemplate(Mail mail){
       log.info("邮件的模版内容：" + mail.getContent());
   }
}