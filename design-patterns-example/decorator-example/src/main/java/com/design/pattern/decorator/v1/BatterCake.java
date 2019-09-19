package com.design.pattern.decorator.v1;

/**
 * BatterCake 煎饼类
 *
 * @author shunhua
 * @date 2019-09-19
 */
public class BatterCake {
    /**
     * 获取食品描述
     * @return
     */
    public String getDesc(){
        return "煎饼";
    }

    /**
     * 食品单价
     * @return
     */
    public int cost(){
        return 5;
    }
}