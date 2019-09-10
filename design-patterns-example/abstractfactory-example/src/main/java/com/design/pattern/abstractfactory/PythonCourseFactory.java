package com.design.pattern.abstractfactory;

/**
 * PythonCourseFactory
 *
 * @author shunhua
 * @date 2019-09-10
 */
public class PythonCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}