package com.design.pattern.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * EggDecorator
 *
 * @author shunhua
 * @date 2019-09-19
 */
@Slf4j
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }

    @Override
    protected void handle() {
        log.info("鸡蛋装饰者特有的处理");
    }
}