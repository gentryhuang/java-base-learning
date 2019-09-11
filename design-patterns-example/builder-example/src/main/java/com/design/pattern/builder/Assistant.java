package com.design.pattern.builder;

/**
 * Assistant 课程助教
 *
 * @author shunhua
 * @date 2019-09-11
 */
public class Assistant {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    /**
     * 课程助教 组装课程
     * @param name
     * @param source
     * @param video
     * @return
     */
    public Course buildCourse(String name,String source,String video){
      this.courseBuilder.buildName(name);
      this.courseBuilder.buildSource(source);
      this.courseBuilder.buildVideo(video);
      return this.courseBuilder.buildCourse();
    }

}