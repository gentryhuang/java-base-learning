package com.design.pattern.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * SauseDecorator
 *
 * @author shunhua
 * @date 2019-09-19
 */
@Slf4j
public class SauseDecorator extends AbstractDecorator {

    public SauseDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }

    @Override
    protected void handle() {
       log.info("香肠装饰者特有的处理方式");
    }
}