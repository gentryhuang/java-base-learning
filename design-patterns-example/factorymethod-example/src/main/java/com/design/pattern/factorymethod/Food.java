package com.design.pattern.factorymethod;

/**
 * 相同类型的产品属于同一个产品等级，无论是面包还是沙拉，它们都是同一个等级，这里是Food
 *
 * @author shunhua
 * @date 2019-09-09
 */
public abstract class Food {
   /**
    * 生产产品方法
    */
   public abstract void produce();
}