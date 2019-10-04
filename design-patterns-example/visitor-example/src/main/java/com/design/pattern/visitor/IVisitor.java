package com.design.pattern.visitor;

/**
 * IVisitor 访问接口
 *
 * 这里定义了访问资源的操作，具体的访问细节体现在实现类中，不同的实现类对相同的资源产生不同的操作行为，这是访问者的核心
 *
 * @author shunhua
 * @date 2019-10-05
 */
public interface IVisitor {

    /**
     * 访问免费课程
     * @param freeCourse
     */
    void visit(FreeCourse freeCourse);

    /**
     * 访问付费课程
     * @param payCourse
     */
    void visit(PayCourse payCourse);

}
