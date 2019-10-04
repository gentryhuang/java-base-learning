package com.design.pattern.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * PayCourse
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Getter
@Setter
public class PayCourse extends Course {
    /**
     * 价格
     */
    private int price;

    /**
     * 接受访问
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}