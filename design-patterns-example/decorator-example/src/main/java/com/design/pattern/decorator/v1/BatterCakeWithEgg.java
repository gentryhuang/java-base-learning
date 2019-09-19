package com.design.pattern.decorator.v1;

/**
 * BatterCakeWithEgg  加鸡蛋的煎饼
 *
 * @author shunhua
 * @date 2019-09-19
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}