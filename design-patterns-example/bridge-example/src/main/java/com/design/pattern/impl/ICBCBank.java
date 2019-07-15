package com.design.pattern.impl;

import com.design.pattern.service.Account;
import com.design.pattern.service.Bank;

/**
 * ICBCBank
 *
 * @author shunhua
 * @date 2019-07-16
 */
public class ICBCBank extends Bank {

    /**
     *  构造的时候传入的是哪个Account就返回哪一个Account(openAccount方法)
     * @param account
     */
    public ICBCBank(Account account) {
        super(account);
    }

    /**
     * 这里返回的就是父类中的Account
     * @return
     */
    @Override
    public Account openAccount() {
        System.out.println("ICBC--开户中国工商银行账号");
        account.openAccount();
        return account;
    }

}