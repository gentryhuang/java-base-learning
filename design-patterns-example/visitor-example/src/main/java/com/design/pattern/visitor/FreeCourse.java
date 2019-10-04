package com.design.pattern.visitor;

/**
 * FreeCourse
 *
 * @author shunhua
 * @date 2019-10-05
 */
public class FreeCourse extends Course {

    /**
     * 接受访问
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}