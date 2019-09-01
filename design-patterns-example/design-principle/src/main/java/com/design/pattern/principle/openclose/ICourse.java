package com.design.pattern.principle.openclose;

/**
 * ICourse
 *
 * @author shunhua
 * @date 2019-09-01
 */
public interface ICourse {
    /**
     * 获取课程id
     * @return
     */
    Integer getId();
    /**
     * 获取课程名称
     * @return
     */
    String getName();
    /**
     * 获取课程价格
     * @return
     */
    Double getPrice();
}
