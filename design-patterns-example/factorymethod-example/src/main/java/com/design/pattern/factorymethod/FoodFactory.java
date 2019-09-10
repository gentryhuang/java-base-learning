package com.design.pattern.factorymethod;

/**
 * 工厂方法
 * 这里使用抽象类主要考虑到在类中有些是已知的，使用抽象类合适。如果全都是未知的使用接口比较合适。
 * @author shunhua
 * @date 2019-09-09
 */
public abstract class FoodFactory {
    /**
     * 工厂方法，起到规约的作用，并不生产具体的产品，具体产品的生成由其实现完成
     * @return
     */
    public abstract Food createFood();
}