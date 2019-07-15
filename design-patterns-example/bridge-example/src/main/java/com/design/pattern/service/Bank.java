package com.design.pattern.service;

/**
 * Bank
 *
 * @author shunhua
 * @date 2019-07-16
 */
public abstract class Bank {

    /**
     * 这里要写成一个抽象的，因为要把Account引入到Bank里面，通
     * 过这种组合的方式，把Account的行为交给Bank的子类来实现，即
     * Bank这个抽象类中的某个行为要委托给Account这个接口的实现，
     * 抽象和具体的实现分离指定的就是这种情况。
     */

    /**
     * 要交给子类，声明为protected
     */
    protected Account account;

    /**
     * 通过构造器把Account传过来，也可以通过setter注入的方式赋值
     */
    public Bank(Account account){
        this.account = account;
    }
    /**
     *  这个方法要参照Account接口中的方法，因为Bank里面的具体方法要委托给Account里面
     *  的openAccount方法，但这里面方法名不要求一定一致
     */
    public abstract Account openAccount();


}