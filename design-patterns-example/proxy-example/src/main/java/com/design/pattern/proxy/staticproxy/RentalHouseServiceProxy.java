package com.design.pattern.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * RentalHouseServiceProxy 代理类
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class RentalHouseServiceProxy {
    /**
     * 代理对象需要目标对象
     */
    private RentalHouseServiceImpl rentalHouseService;

    /**
     * 构造方法
     */
    public RentalHouseServiceProxy(){
        rentalHouseService = new RentalHouseServiceImpl();
    }

    /**
     * 代理方法
     */
    public void rent(){
        dialNumber();
        rentalHouseService.rent();
        signContract();
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