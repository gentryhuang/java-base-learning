package com.design.pattern.decorator.v2;

/**
 * BatterCake  实体煎饼类
 *
 * @author shunhua
 * @date 2019-09-19
 */
public class BatterCake extends AbstractBatterCake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 5;
    }
}