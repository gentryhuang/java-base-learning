package com.design.pattern.simplefactory;

import com.common.base.ObjectUtils;
import com.design.pattern.simplefactory.Bread;
import com.design.pattern.simplefactory.Food;
import com.design.pattern.simplefactory.FoodFactory;
import com.design.pattern.simplefactory.Salad;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-09
 */
public class Client {

    @Test
    public void simpleFactoryBefore(){
        // 这里需要依赖具体的生产类
        Food food = new Bread();
        Food food1 = new Salad();
        food.produce();
        food1.produce();
    }

    @Test
    public void simpleFactoryByType(){
        // 创建一个简单工厂
        FoodFactory factory = new FoodFactory();
        // 由工厂创建实例对象
        Food food = factory.createFood("salad");

        food.produce();
    }

    @Test
    public void simpleFactoryByClass(){
        FoodFactory factory = new FoodFactory();
        Food food = factory.createFood(Bread.class);
        if(ObjectUtils.isNotNull(food)){
            food.produce();
        }
    }
}