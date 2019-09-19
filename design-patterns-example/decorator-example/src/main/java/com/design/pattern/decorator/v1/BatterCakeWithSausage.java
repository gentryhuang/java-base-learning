package com.design.pattern.decorator.v1;

/**
 * BatterCakeWithSausage 加香肠的煎饼
 *
 * @author shunhua
 * @date 2019-09-19
 */
public class BatterCakeWithSausage extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}