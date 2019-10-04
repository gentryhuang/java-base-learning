package com.design.pattern.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * VipVisitor Vip访问者
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Slf4j
public class VipVisitor implements IVisitor{

    /**
     * 访问免费课程
     * @param freeCourse
     */
    @Override
    public void visit(FreeCourse freeCourse) {
         log.info("免费课程名：" + freeCourse.getName());
    }

    /**
     * 访问付费课程
     * @param payCourse
     */
    @Override
    public void visit(PayCourse payCourse) {
       log.info("付费课程名：" + payCourse.getName() + " 价格为：" + payCourse.getPrice());
    }
}