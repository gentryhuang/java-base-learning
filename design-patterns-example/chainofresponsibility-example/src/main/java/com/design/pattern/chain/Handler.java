package com.design.pattern.chain;

/**
 * Handler 责任链模式的核心
 *
 * 注意：构造责任链是客户端的任务,并且入口也是客户单选择的
 *
 * @author shunhua
 * @date 2019-10-04
 */
public abstract class Handler {

    /**
     * 一个自己类型的对象，一般是子类对象
     */
    protected Handler handler;

    /**
     * 设置下一个处理器
     * @param handler
     */
    public void setNextHandler(Handler handler){
        this.handler = handler;
    }

    /**
     * 交给子类实现，用来校验用户信息是否符合
     * @param user
     */
    protected abstract void handle(User user);

}