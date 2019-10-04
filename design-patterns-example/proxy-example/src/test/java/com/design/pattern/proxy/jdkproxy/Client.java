package com.design.pattern.proxy.jdkproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class Client {

    @Test
    public void test(){
        // 创建目标对象
        IRentalHouseService target =  new RentalHouseServiceImpl();

        // 创建代理对象（接口实现类的代理对象）
        IRentalHouseService proxy = (IRentalHouseService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new RentalHouseServiceProxy(target)
        );

        /**
         * 调用代理对象的代理方法,注意当调用代理对象的代理方法时，InvocationHandler的invoke方法会被自动调用
         */
        proxy.rent();
    }

}