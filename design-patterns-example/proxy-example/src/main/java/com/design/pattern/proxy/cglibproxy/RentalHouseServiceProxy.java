package com.design.pattern.proxy.cglibproxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * RentalHouseServiceProxy  没接口的时候，把使用接口类型的引用全都改为类类型即可
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class RentalHouseServiceProxy implements MethodInterceptor {

    /**
     * 声明目标对象
     */
    private IRentalHouseService target;

    public RentalHouseServiceProxy(IRentalHouseService target) {
        super();
        this.target = target;
    }

    /**
     * @param obj         代理对象
     * @param method      目标方法
     * @param args        目标方法参数列表
     * @param methodProxy 目标方法的代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        dialNumber();
        // 执行目标方法
        Object result = method.invoke(target, args);
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