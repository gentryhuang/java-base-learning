package com.design.pattern.service;

/**
 * Account
 *
 * @date 2019-07-16
 * @author shunhua
 */
public interface Account {

    /**
     * 开户
     * @return
     */
    Account openAccount();

    /**
     * 开户类型
     */
    void showAccountType();
}
