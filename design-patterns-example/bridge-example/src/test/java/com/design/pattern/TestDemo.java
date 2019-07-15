package com.design.pattern;

import com.design.pattern.impl.ABCBank;
import com.design.pattern.impl.DepositAccount;
import com.design.pattern.impl.ICBCBank;
import com.design.pattern.impl.SavingAccount;
import com.design.pattern.service.Account;
import com.design.pattern.service.Bank;
import org.junit.Test;

/**
 * TestDemo
 *
 * @author shunhua
 * @date 2019-07-16
 */
public class TestDemo {

    @Test
    public void test() {
        // ICBCBank-DepositAccount
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        System.out.println("**************************");
        icbcAccount.showAccountType();
        System.out.println("--------------------------");
        // ICBCBank-SavingAccount
        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        System.out.println("**************************");
        icbcAccount2.showAccountType();
        System.out.println("--------------------------");

        // ABCBank-DepositAccount
        Bank abcBank2 = new ABCBank(new DepositAccount());
        Account abcAccount2 = abcBank2.openAccount();
        System.out.println("**************************");
        abcAccount2.showAccountType();
        System.out.println("--------------------------");
        // ABCBank-SavingAccount
        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        System.out.println("**************************");
        abcAccount.showAccountType();
    }

}