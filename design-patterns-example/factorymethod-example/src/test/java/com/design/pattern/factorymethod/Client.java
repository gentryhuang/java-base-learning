package com.design.pattern.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-10
 */
@Slf4j
public class Client {

    @Test
    public void test(){
        // 面包工厂方法
        FoodFactory breadFactory = new BreadFactory();
        Food bread = breadFactory.createFood();
        log.info(String.valueOf(bread));
        // 沙拉工厂方法
        FoodFactory saladFactory = new SaladFactory();
        Food salad = saladFactory.createFood();
        log.info(String.valueOf(salad));

    }

}