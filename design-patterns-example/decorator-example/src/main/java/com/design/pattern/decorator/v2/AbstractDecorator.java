package com.design.pattern.decorator.v2;

/**
 *
 *  装饰者同样继承 抽象煎饼类，这是为了方便 ，和煎饼类交互
 *
 *  如果不用构造器的方式，也可以使用set方式
 *
 * @author shunhua
 * @date 2019-09-19
 */
public abstract class AbstractDecorator extends AbstractBatterCake {
    /**
     * 定义煎饼属性，用于注入
     */
    private AbstractBatterCake batterCake;

    public AbstractDecorator(AbstractBatterCake batterCake){
        this.batterCake = batterCake;
    }

    @Override
    public String getDesc() {
        return batterCake.getDesc();
    }

    @Override
    public int cost() {
        return batterCake.cost();
    }

    /**
     * 装饰者实体类特有操作
     */
    protected abstract void handle();
}