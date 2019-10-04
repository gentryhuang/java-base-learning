package com.design.pattern.proxy.cglibproxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * RentalHouseServiceProxy
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class RentalHouseServiceProxy implements MethodInterceptor {


    /**
     *
     * @param o  代理对象
     * @param method 目标方法
     * @param objects 目标方法参数列表
     * @param methodProxy 目标方法的代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }

    /**
     * 需要房租请联系我，目标方法的前置方法
     */
    private void dialNumber() {
        log.info("需要租房请致电：123456");
    }

    /**
     * 签合同，目标方法的后置方法
     */
    private void signContract() {
        log.info("房子还满意就可以签合同了！");
    }


}