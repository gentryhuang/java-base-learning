package com.design.pattern.factorymethod;

/**
 * SaladFactory 只生产Salad
 *
 * @author shunhua
 * @date 2019-09-10
 */
public class SaladFactory extends FoodFactory {
    /**
     * 生产面包的工厂方法
     * @return
     */
    @Override
    public Food createFood() {
        return new Salad();
    }
}