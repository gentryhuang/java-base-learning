package com.design.pattern.builder;

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

}