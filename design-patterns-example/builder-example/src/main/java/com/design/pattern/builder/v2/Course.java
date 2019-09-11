package com.design.pattern.builder.v2;

import lombok.Data;

/**
 * Course
 *
 * @author shunhua
 * @date 2019-09-11
 */
@Data
public class Course {

    /**
     * 课程名
     */
    private String name;
    /**
     * 课程资料
     */
    private String source;
    /**
     * 课程视频
     */
    private String video;

    public Course(CourseBuilder courseBuilder){
       this.name = courseBuilder.name;
       this.source = courseBuilder.source;
       this.video = courseBuilder.video;
    }

    /**
     * 把实体类与对应的创建类写在一起，这种使用更常见,使用链式调用
     */
    public static class CourseBuilder {
        /**
         * 课程名
         */
        private String name;
        /**
         * 课程资料
         */
        private String source;
        /**
         * 课程视频
         */
        private String video;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildSource(String source) {
           this.source = source;
           return this;
        }

        public CourseBuilder buildVideo(String video) {
            this.video = video;
            return this;
        }

        /**
         *
         * @return
         */
        public Course build(){
            return new Course(this);
        }
    }

}