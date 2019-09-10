package com.design.pattern.factorymethod;

/**
 * BreadFactory  只生产Bread
 *
 * @author shunhua
 * @date 2019-09-10
 */
public class BreadFactory extends FoodFactory {

    /**
     * 生产面包的工厂方法
     * @return
     */
    @Override
    public Food createFood() {
        return new Bread();
    }
}