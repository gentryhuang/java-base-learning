package com.design.pattern.abstractfactory;

/**
 * JavaCourseFactory
 *
 * @author shunhua
 * @date 2019-09-10
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}