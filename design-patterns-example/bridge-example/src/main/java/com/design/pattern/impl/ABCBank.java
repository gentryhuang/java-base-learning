package com.design.pattern.impl;

import com.design.pattern.service.Account;
import com.design.pattern.service.Bank;

/**
 * ABCBank
 *
 * @date 2019-07-16
 * @author shunhua
 */
public class ABCBank extends Bank {

    /**
     * 构造的时候传入的是哪个Account就返回哪一个Account(openAccount方法)
     * @param account
     */
    public ABCBank(Account account) {
        super(account);
    }

    /**
     * 这里返回的就是父类中的Account
     * @return
     */
    @Override
    public Account openAccount() {
        System.out.println("ABCBank--开户中国农业银行账号");
        account.openAccount();
        return account;
    }
}