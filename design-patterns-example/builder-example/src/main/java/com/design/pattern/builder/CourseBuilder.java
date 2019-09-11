package com.design.pattern.builder;

/**
 * CourseBuilder
 *
 * @author shunhua
 * @date 2019-09-11
 */
public abstract class CourseBuilder {
    /**
     * 建造课程名
     * @param name
     */
    public abstract void buildName(String name);

    /**
     * 建造课程资料
     * @param source
     */
    public abstract void buildSource(String source);

    /**
     * 建造课程视频
     * @param video
     */
    public abstract void buildVideo(String video);

    /**
     * 构建课程
     * @return
     */
    public abstract Course buildCourse();
}