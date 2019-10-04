package com.design.pattern.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * Course 被访问的资源
 *
 * 不改变Course,而是定义访问Course的操作，这里体现在IVisitor的方法上
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Getter
@Setter
public abstract class Course {
    /**
     * 课程名称
     */
    private String name;

    /**
     * 接受访问  把访问者传入
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);

}