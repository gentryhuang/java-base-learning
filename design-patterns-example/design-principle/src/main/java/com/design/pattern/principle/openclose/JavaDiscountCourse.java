package com.design.pattern.principle.openclose;

/**
 * JavaDiscountCourse
 *
 * @author shunhua
 * @date 2019-09-01
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取折扣价
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    /**
     * 获取原价
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

}