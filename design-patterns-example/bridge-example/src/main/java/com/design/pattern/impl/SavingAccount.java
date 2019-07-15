package com.design.pattern.impl;

import com.design.pattern.service.Account;

/**
 * SavingAccount
 *
 * 活期账号
 * @author shunhua
 * @date 2019-07-16
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("SavingAccount--开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("SavingAccount--这是一个活期账号");
    }
}