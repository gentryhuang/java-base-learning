package com.design.pattern.builder;

/**
 * ActualCourseBuilder  真正的课程创建者
 *
 * @author shunhua
 * @date 2019-09-11
 */
public class ActualCourseBuilder extends CourseBuilder{

    private Course course = new Course();

    @Override
    public void buildName(String name) {
       course.setName(name);
    }

    @Override
    public void buildSource(String source) {
       course.setSource(source);
    }

    @Override
    public void buildVideo(String video) {
       course.setVideo(video);
    }

    @Override
    public Course buildCourse() {
        return course;
    }
}