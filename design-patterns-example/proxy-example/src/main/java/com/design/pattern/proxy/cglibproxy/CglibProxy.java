package com.design.pattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * CglibProxy  手动创建
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class CglibProxy {

    /**
     * 创建Cglib的代理对象
     *
     * @param targetClass 目标类
     * @param callBack  委托类对象
     * @return
     */
    public static IRentalHouseService createCglibProxy(Class targetClass, MethodInterceptor callBack){
        // 创建增强其
        Enhancer enhancer = new Enhancer();

        // 指定目标类
        enhancer.setSuperclass(targetClass);

        // 设置回调接口
        enhancer.setCallback(callBack);

        // 创建并返回代理对象，即目标类的子类对象
        return (IRentalHouseService) enhancer.create();
    }

}