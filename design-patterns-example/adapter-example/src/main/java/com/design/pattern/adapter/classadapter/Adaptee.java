package com.design.pattern.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Adaptee 被适配者
 *
 * @author shunhua
 * @date 2019-09-21
 */
@Slf4j
public class Adaptee {
    /**
     * 适配方法，想要和目标类一起工作
     */
   public void adaptee(){
       log.info("被适配者...run");
   }
}