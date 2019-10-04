package com.design.pattern.proxy.jdkproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * RentalHouseServiceProxy
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class RentalHouseServiceProxy implements InvocationHandler {

    private IRentalHouseService target;

    public RentalHouseServiceProxy(IRentalHouseService target) {
        this.target = target;
    }

    /**
     * 当执行代理对象的代理方法时，代理方法会调用该invoke()
     *
     * @param proxy 代理对象
     * @param method 目标方法
     * @param args 目标方法的参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用目标方法前
        dialNumber();
        // 执行目标方法
        Object result = method.invoke(target, args);
        // 调用目标方法后
        signContract();

        return result;

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