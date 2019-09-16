package com.design.pattern.prototype;

import lombok.Data;

/**
 * Mail
 *
 * @author shunhua
 * @date 2019-09-16
 */
@Data
public class Mail implements Cloneable {
    /**
     * 邮件名
     */
    private String name;
    /**
     * 邮件地址
     */
    private String address;
    /**
     * 邮件内容
     */
    private String content;

    /**
     * 重写克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("克隆Mail...");
        return super.clone();
    }
}