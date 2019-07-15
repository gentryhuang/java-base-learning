package com.design.pattern.impl;

import com.design.pattern.service.Account;

/**
 * DepositAccount
 *
 * 定期账号
 * @date 2019-07-16
 * @author shunhua
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("DepositAccount--开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("DepositAccouont--这是一个定期账号");
    }

}